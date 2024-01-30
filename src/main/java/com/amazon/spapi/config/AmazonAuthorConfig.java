package com.amazon.spapi.config;

import lombok.Data;

@Data
public class AmazonAuthorConfig {
    public AmazonAuthorConfig(){ }
    public AmazonAuthorConfig(String refreshToken,String region,String spEndPoint){
        //APP Name
        this.appId="amzn1.sp.solution.6666666666666666";

        this.clientId="amzn1.application-oa2-client.6666666666666666666";
        //此参数需要半年180定期更换一次，否则Amazon江停止API使用
        /**
         * 注意：生成新的 LWA 凭据（客户端密码）后，您必须为调用 Amazon API 的任何应用程序更新您的凭据。您的旧凭据会在您生成新凭据 7 天后过期。记录您的凭据以供参考。
         * 更多信息有关更多信息，请参阅 SP-API 文档中的轮换应用程序的 LWA 凭证。
         * https://developer-docs.amazon.com/sp-api/docs/rotating-your-apps-lwa-credentials
         * @author supoman
         * @date 2023/2/7
         */
        this.clientSecret="amzn1.oa2-cs.v1.66666666666666666";
        this.lwaEndpoint="https://api.amazon.com/auth/o2/token";


        //注意，以下的endpoint分北美，欧洲，远东三个地域，每个区域的链接是不一样的
        this.refreshToken=refreshToken;
        this.region=region;//根据区域确定
        this.spEndPoint=spEndPoint;//根据区域确定
    }


    /**
     * 区域
     */
    private String region;



    /**


    /**
     * APP LWA客户端编码
     */
    private String clientId;

    /**
     * APP LWA客户端秘钥
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
    /**
    * 开发者APP
    */
    private String appId;
}
