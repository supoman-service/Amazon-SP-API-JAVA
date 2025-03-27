package com.amazon.spapi.common;

import com.amazon.spapi.SellingPartnerAPIAA.LWAAuthorizationCredentials;

import com.amazon.spapi.config.AmazonAuthorConfig;
import lombok.Data;

import static com.amazon.spapi.SellingPartnerAPIAA.ScopeConstants.SCOPE_NOTIFICATIONS_API;

/**
 * @author:Amte Ma
 * @description:亚马逊店铺授权认证信息
 * @date:2021/5/26
 */
@Data
public class AwsAuthInfo {
  /*  AWSAuthenticationCredentials awsAuthenticationCredentials;
    AWSAuthenticationCredentialsProvider awsAuthenticationCredentialsProvider;*/
    LWAAuthorizationCredentials lwaAuthorizationCredentials;

    /**
     * 需要授权token操作
     * @author AmteMa
     * @date 2022/1/13
     * @param  * @param authorConfigDTO
     * @return
     */
    public  AwsAuthInfo(AmazonAuthorConfig authorConfigDTO) {

        //注意这个地方的region分北美，欧洲，远东三个AWS区域
       /* awsAuthenticationCredentials = AWSAuthenticationCredentials.builder()
                //注册成为开发者时生成的AWS访问密钥ID
                .accessKeyId(authorConfigDTO.getAccessKeyId())
                //注册成为开发者时生成的AWS访问密钥
                .secretKey(authorConfigDTO.getSecretKey())
                //注意，这里的region分北美(us-east-1)，欧洲(eu-west-1)，远东(us-west-2)
                .region(authorConfigDTO.getRegion())
                .build();

        awsAuthenticationCredentialsProvider = AWSAuthenticationCredentialsProvider.builder()
                //创建IAM职权的时候会生成这个ARN
                .roleArn(authorConfigDTO.getRoleArn())
                //唯一值，可以使用UUID
                .roleSessionName(authorConfigDTO.getRoleSessionName())
                .build();*/

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


        //注意这个地方的region分北美，欧洲，远东三个AWS区域
       /* awsAuthenticationCredentials = AWSAuthenticationCredentials.builder()
                //注册成为开发者时生成的AWS访问密钥ID
                .accessKeyId(authorConfigDTO.getAccessKeyId())
                //注册成为开发者时生成的AWS访问密钥
                .secretKey(authorConfigDTO.getSecretKey())
                //注意，这里的region分北美(us-east-1)，欧洲(eu-west-1)，远东(us-west-2)
                .region(authorConfigDTO.getRegion())
                .build();

        awsAuthenticationCredentialsProvider = AWSAuthenticationCredentialsProvider.builder()
                //创建IAM职权的时候会生成这个ARN
                .roleArn(authorConfigDTO.getRoleArn())
                //唯一值，可以使用UUID
                .roleSessionName(authorConfigDTO.getRoleSessionName())
                .build();*/

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
