package com.amazon.spapi.documents;

import com.amazon.spapi.documents.exception.CryptoException;
import com.amazon.spapi.documents.exception.HttpResponseException;
import com.amazon.spapi.documents.exception.MissingCharsetException;
import com.amazon.spapi.documents.impl.AESCryptoStreamFactory;
import com.amazon.spapi.utils.StringBuilderPlus;

import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.nio.charset.Charset;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.zip.GZIPInputStream;
import java.util.zip.ZipException;

import okhttp3.*;
/*
import com.squareup.okhttp.MediaType;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import com.squareup.okhttp.ResponseBody;
*/

//下载报告
public class DownloadDocument {

    final DownloadHelper downloadHelper = new DownloadHelper.Builder().build();

    /*
     * 通过已创建的报告documentId Url下载报告内容
     * @author Amte Ma
     * @date 2021/5/26
     * @param key 报告解密密钥
     * @param initializationVector 偏移量
     * @param documentId Url
     * @return java.lang.String
     */
    public String downloadAndDecrypt(String key, String initializationVector, String url, String compressionAlgorithm) {
        AESCryptoStreamFactory aesCryptoStreamFactory =
                new AESCryptoStreamFactory.Builder(key, initializationVector).build();
        DownloadSpecification downloadSpec = null;
        if (compressionAlgorithm != null && !compressionAlgorithm.equals("")) {
            downloadSpec = new DownloadSpecification.Builder(aesCryptoStreamFactory, url)
                    .withCompressionAlgorithm(CompressionAlgorithm.fromEquivalent(compressionAlgorithm))
                    .build();
        } else {
            downloadSpec = new DownloadSpecification.Builder(aesCryptoStreamFactory, url).build();
        }

        StringBuilderPlus sb = new StringBuilderPlus();
        try (DownloadBundle downloadBundle = downloadHelper.download(downloadSpec)) {
            try (BufferedReader reader = downloadBundle.newBufferedReader(Charset.forName("utf-8"))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    sb.appendLine(line);
                }
                return sb.toString();
            }
        } catch (CryptoException | HttpResponseException | MissingCharsetException | IOException e) {
            e.printStackTrace();
        }
        return null;
    }


    /**
     * 下载报告数据。Download and optionally decompress the document retrieved from the given url. V2版本
     *
     * @param url                  the url pointing to a document
     * @param compressionAlgorithm the compressionAlgorithm used for the document
     * @throws IOException              when there is an error reading the response
     * @throws IllegalArgumentException when the charset is missing
     * @author Amte Ma
     * @date 2021/5/26
     */
    public String download(String url, String compressionAlgorithm) throws IOException, IllegalArgumentException {
        Request request = new Request.Builder().url(url).get().build();
        Response response = OkHttpUtils.getInstance().newCall(request).execute();
        if (!response.isSuccessful()) {
            System.out.println(
                    String.format("Call to download content was unsuccessful with response code: %d and message: %s",
                            response.code(), response.message()));
            return null;
        }
        try (ResponseBody responseBody = response.body()) {
            MediaType mediaType = MediaType.parse(response.header("Content-Type"));
            Charset charset = mediaType.charset();
            Closeable closeThis = null;
            try {
                InputStream inputStream = responseBody.byteStream();
                closeThis = inputStream;

                if ("GZIP".equals(compressionAlgorithm)) {
                    inputStream = new GZIPInputStream(inputStream);
                    closeThis = inputStream;
                }
                InputStreamReader inputStreamReader;
                if (charset ==null){
                    inputStreamReader = new InputStreamReader(inputStream);
                }else{
                    inputStreamReader = new InputStreamReader(inputStream, charset);
                }
                BufferedReader reader = new BufferedReader(inputStreamReader);
                closeThis = reader;
                StringBuilderPlus sb = new StringBuilderPlus();
                String line;
                while ((line = reader.readLine()) != null) {
                    sb.appendLine(line);
                }
                return sb.toString();
            }catch (Exception e){
            e.printStackTrace();
            throw e;
        }

            finally {
                if (closeThis != null) {
                    closeThis.close();
                }
            }
        }
    }


    public String download(String url) throws IOException, IllegalArgumentException {
        OkHttpClient httpclient = new OkHttpClient();
        Request request = new Request.Builder()
                .url(url)
                .get()
                .build();

        Response response = httpclient.newCall(request).execute();
        if (!response.isSuccessful()) {
            System.out.println(
                    String.format("Call to download content was unsuccessful with response code: %d and message: %s",
                            response.code(), response.message()));
            return null;
        }

        try (ResponseBody responseBody = response.body()) {
            MediaType mediaType = MediaType.parse(response.header("Content-Type"));
            Charset charset = mediaType.charset();
            if (charset == null) {
                throw new IllegalArgumentException(String.format(
                        "Could not parse character set from '%s'", mediaType.toString()));
            }

            Closeable closeThis = null;
            try {
                InputStream inputStream = responseBody.byteStream();
                closeThis = inputStream;



                    InputStreamReader inputStreamReader = new InputStreamReader(inputStream, charset);
                    closeThis = inputStreamReader;

                    BufferedReader reader = new BufferedReader(inputStreamReader);
                    closeThis = reader;
                    StringBuilderPlus sb = new StringBuilderPlus();
                    String line;
                    do {
                        line = reader.readLine();
                        sb.appendLine(line);

                    } while (line != null);
                    return sb.toString();

            } finally {
                if (closeThis != null) {
                    closeThis.close();
                }
            }
        }
    }

}
