package com.amazon.spapi.documents;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

import java.nio.charset.StandardCharsets;


import com.amazon.spapi.documents.exception.CryptoException;
import com.amazon.spapi.documents.exception.HttpResponseException;
import com.amazon.spapi.documents.impl.AESCryptoStreamFactory;
import com.squareup.okhttp.*;

/**
 * @author:supoman
 * @description:FeedsApi操作上传下载
 * @date:2021/6/15
 */
public class UploadDocument {
    private final UploadHelper uploadHelper = new UploadHelper.Builder().build();

    // key, initializationVector, and url are returned by the createFeedDocument operation.
    public String encryptAndUpload_fromString(String key, String initializationVector, String url,String input) {
        AESCryptoStreamFactory aesCryptoStreamFactory =
                new AESCryptoStreamFactory.Builder(key, initializationVector)
                        .build();

        // This contentType must be the same value that was provided to createFeedDocument.
        //String contentType = String.format("text/plain; charset=%s", StandardCharsets.UTF_8);
        String contentType = "text/tab-separated-values; charset=UTF-8";

        // The character set must be the same one that is specified in contentType.
        try
                (InputStream source = new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8))) {
            UploadSpecification uploadSpec =
                    new UploadSpecification.Builder(contentType, aesCryptoStreamFactory, source, url)
                            .build();

            uploadHelper.upload(uploadSpec);
            return "OK";
        } catch (CryptoException | HttpResponseException | IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public String encryptAndUpload_fromStream(String key, String initializationVector, String url,InputStream source) {
        AESCryptoStreamFactory aesCryptoStreamFactory =
                new AESCryptoStreamFactory.Builder(key, initializationVector)
                        .build();
        String contentType = "text/tab-separated-values; charset=UTF-8";
        try {
            UploadSpecification uploadSpec =
                    new UploadSpecification.Builder(contentType, aesCryptoStreamFactory, source, url)
                            .build();

            uploadHelper.upload(uploadSpec);
            return "OK";
        } catch (CryptoException | HttpResponseException | IOException e) {
            e.printStackTrace();
        }
        return null;
    }
    public String encryptAndUpload_fromStream(String key, String initializationVector, String url,InputStream source,String contentType ) {
        AESCryptoStreamFactory aesCryptoStreamFactory =
                new AESCryptoStreamFactory.Builder(key, initializationVector)
                        .build();
        try  {
            UploadSpecification uploadSpec =
                    new UploadSpecification.Builder(contentType, aesCryptoStreamFactory, source, url)
                            .build();
            uploadHelper.upload(uploadSpec);
            return "OK";
        } catch (CryptoException | HttpResponseException | IOException e) {
            e.printStackTrace();
        }
        return null;
    }
    // key, initializationVector, and url are returned from createFeedDocument.
    public String encryptAndUpload_fromPipedInputStream(String key, String initializationVector, String url,InputStream source,String contentType) {
        AESCryptoStreamFactory aesCryptoStreamFactory =
                new AESCryptoStreamFactory.Builder(key, initializationVector)
                        .build();

        try {
            UploadSpecification uploadSpec =
                    new UploadSpecification.Builder(contentType, aesCryptoStreamFactory, source, url)
                            .build();

            uploadHelper.upload(uploadSpec);
            return "OK";
        } catch (CryptoException | HttpResponseException | IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * https://github.com/amzn/selling-partner-api-docs/blob/main/guides/en-US/use-case-guides/feeds-api-use-case-guide/feeds-api-use-case-guide_2021-06-30.md#step-1-create-a-feed-document
     * @author AmteMa
     * @date 2021/11/22
     * @param source
     * @param url
     * @param contentType The contentType must match the input provided to the createFeedDocument operation. This example uses text/xml, but your contentType may be different depending upon on your chosen feedType (text/plain, text/csv, and so on).
     * @return void
     */
    public String uploadV2(byte[] source, String url, String contentType) {
        OkHttpClient client = new OkHttpClient();


        try {
            Request request = new Request.Builder()
                    .url(url)
                    .put(RequestBody.create(MediaType.parse(contentType), source))
                    .build();

            Response response = client.newCall(request).execute();
            if (!response.isSuccessful()) {
                System.out.println(
                        String.format("Call to upload document failed with response code: %d and message: %s",
                                response.code(), response.message()));
            }
            return "OK";
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;

    }
}
