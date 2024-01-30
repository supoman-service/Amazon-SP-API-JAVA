package com.amazon.spapi.config;

import lombok.Data;

/**
* @author supoman
* @date 2024/01/01
*/
@Data
public class AmazonAuthConfig {
    private String key;
    public AmazonAuthConfig(String key){
        this.key=key;
    }
    public AmazonAuthConfig(String refreshToken, String region, String spEndPoint) throws Exception {

        //Amazon APP
        this.clientId=AesUtil.Decrypt("f5bed884cf288379933b249fecebefe5d9de67561f66666666666666666664e71db9bdb394a77a14e3d58cd6b676c84edd4085748379370d",key);
        this.clientSecret=AesUtil.Decrypt("0129ae15cf7abf358da7dac1fab49fb86a66666666666666666f7ac31e529dbbac99ed0b9e47a061b2125a30ce10c18afc985c3201331f20a1f788fe6d86c317549697fbf0c07fa43",key);
        this.lwaEndpoint="https://api.amazon.com/auth/o2/token";
        this.refreshToken=refreshToken;
        this.region=region;//根据区域确定
        this.spEndPoint=spEndPoint;//根据区域确定
    }


    /**
     * 区域
     */
    private String region;



    /**
     * IAM职权名称
     */
    private String roleSessionName;

    /**
     * LWA客户端编码
     */
    private String clientId;

    /**
     * LWA客户端秘钥
     */
    private String clientSecret;

    /**
     * LWA客户端令牌
     */
    private String refreshToken;

    /**
     * LWA授权服务器的节点地址
     */
    private String lwaEndpoint;

    /**
     * SP授权服务器节点地址
     */
    private String spEndPoint;
}
