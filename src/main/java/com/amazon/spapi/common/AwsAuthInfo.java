package com.amazon.spapi.common;

import com.amazon.spapi.SellingPartnerAPIAA.LWAAuthorizationCredentials;

import com.amazon.spapi.config.AmazonAuthorConfig;
import lombok.Data;

import static com.amazon.spapi.SellingPartnerAPIAA.ScopeConstants.SCOPE_NOTIFICATIONS_API;

/**
 * @author:supoman
 * @description:亚马逊店铺授权认证信息
 * @date:2024/01/01
 */
@Data
public class AwsAuthInfo {
    LWAAuthorizationCredentials lwaAuthorizationCredentials;

    /**
     * 需要授权token操作
     * @author AmteMa
     * @date 2022/1/13
     * @param  * @param authorConfigDTO
     * @return
     */
    public  AwsAuthInfo(AmazonAuthorConfig authorConfigDTO) {
        lwaAuthorizationCredentials = LWAAuthorizationCredentials.builder()
                //查看开发者信息的时候可看到LWA的客户端编码
                .clientId(authorConfigDTO.getClientId())
                //查看开发者信息的时候可看到LWA的客户端秘钥
                .clientSecret(authorConfigDTO.getClientSecret())
                //根据上面的客户端编码和客户端秘钥请求客户端令牌
                .refreshToken(authorConfigDTO.getRefreshToken())
                //"https://api.amazon.com/auth/o2/token"
                .endpoint(authorConfigDTO.getLwaEndpoint())
                .build();

    }

    /**
     * 无需授权token操作
     * @author AmteMa
     * @date 2022/1/13
     * @param  * @param authorConfigDTO
     * @return
     */

    public  AwsAuthInfo(AmazonAuthorConfig authorConfigDTO,String noAuth) {
        lwaAuthorizationCredentials = LWAAuthorizationCredentials.builder()
                //查看开发者信息的时候可看到LWA的客户端编码
                .clientId(authorConfigDTO.getClientId())
                //查看开发者信息的时候可看到LWA的客户端秘钥
                .clientSecret(authorConfigDTO.getClientSecret())
                .refreshToken(authorConfigDTO.getRefreshToken())
                .withScopes(SCOPE_NOTIFICATIONS_API)
                //"https://api.amazon.com/auth/o2/token"
                .endpoint(authorConfigDTO.getLwaEndpoint())
                .build();

    }
}
