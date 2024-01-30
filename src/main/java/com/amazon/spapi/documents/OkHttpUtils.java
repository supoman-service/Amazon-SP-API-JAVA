package com.amazon.spapi.documents;

import okhttp3.*;

import java.util.concurrent.TimeUnit;

/**
 * <Description> <br>
 *
 * @author supoman<br>
 * @version 1.0<br>
 * @date 2023/01/05 <br>
 */
public class OkHttpUtils {

    private final static int READ_TIMEOUT = 100;

    private final static int CONNECT_TIMEOUT = 60;

    private final static int WRITE_TIMEOUT = 60;

    private static volatile OkHttpClient okHttpClient;

    private OkHttpUtils(){

        okhttp3.OkHttpClient.Builder clientBuilder = new okhttp3.OkHttpClient.Builder();
        //读取超时
        clientBuilder.readTimeout(READ_TIMEOUT, TimeUnit.SECONDS);
        //连接超时
        clientBuilder.connectTimeout(CONNECT_TIMEOUT, TimeUnit.SECONDS);
        //写入超时
        clientBuilder.writeTimeout(WRITE_TIMEOUT, TimeUnit.SECONDS);
        //自定义连接池最大空闲连接数和等待时间大小，否则默认最大5个空闲连接
        clientBuilder.connectionPool(new ConnectionPool(32,5,TimeUnit.MINUTES));

        okHttpClient = clientBuilder.build();
    }
    /**
    * 重新定义okhttp连接池最大空闲数量设为32，防止无连接可用等待超时后抛异常
    * @author AmteMa
    * @date 2023/1/5
    */
    public static OkHttpClient getInstance(){
        if (null == okHttpClient){
            synchronized (OkHttpUtils.class){
                if (okHttpClient == null){
                    new OkHttpUtils();
                    return okHttpClient;
                }
            }
        }
        return okHttpClient;
    }
}

