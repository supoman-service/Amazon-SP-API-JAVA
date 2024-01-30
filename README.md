# amazon-sp-api
amazon sp api java sdk
背景：

    本项目基于参考大佬penghaiping的项目结构：https://github.com/penghaiping/amazon-sp-api
    由于这个项目年份已久很少更新，加上还有调用的问题，在参考次基础上将我的扩展奉上，供各位同行兄弟参考使用。
    1.升级最新版本
    2.修复相关bug
        refreshe_token缓存失效问题
        报告download解压bug
        官网swagger-code源码异常
    3.扩展授权配置信息
    ....




SP-API(amazon selling partner api):

       官网文档: https://developer-docs.amazon.com/sp-api
    
       问题集合GitHub: https://github.com/amzn/selling-partner-api-docs/issues
    
       models: https://github.com/amzn/selling-partner-api-models/
    
       SDK生成教程：https://developer-docs.amazon.com/sp-api/docs/generating-a-java-sdk-with-lwa-token-exchange 



使用说明:

    1.所有refrences相关的api的调用类都在src/main/java/com/amazon/spapi/api
    
    2.所有refrences相关的api的调用测试类都在src/test/java/com/amazon/spapi/api
    
    3.几乎都有测试调用类，可参考：com.amazon.spapi.api.Test
    
    4.在FeedApi及reportApi中上传和下载文件的工具类在:com.amazon.spapi.documents.DownloadDocument,修复了官网的bug
    
    5.所有的API都是手动添加方法：
    新增配置文件：com.amazon.spapi.config.AmazonAuthorConfig
                 com.amazon.spapi.common.AwsAuthInfo
```java
 public static FeedsApi amazonAuthorizationApi(AmazonAuthorConfig authorConfigDTO) {
    var authInfo=new AwsAuthInfo(authorConfigDTO);
    FeedsApi feedsApi =new FeedsApi.Builder()

            .lwaAuthorizationCredentials(authInfo.getLwaAuthorizationCredentials())

            .endpoint(authorConfigDTO.getSpEndPoint())
            .build();

    //授权失败，未获取到API实例的话抛出异常，进行重试
    if(null == feedsApi) {
        throw new RuntimeException("授权失败，未获取到API实例，请重试");
    }
    return feedsApi;
}
```
reportApiTest
![image](https://github.com/supoman-service/Amazon-SP-Api-JAVA/assets/20614254/5a222e67-1116-4b21-9da9-6a7bcc51fdfa)

# 交流
![image](https://github.com/supoman-service/Amazon-SP-Api-JAVA/assets/20614254/b1ecd520-40d7-41bc-ab85-a37e00d278ad)
