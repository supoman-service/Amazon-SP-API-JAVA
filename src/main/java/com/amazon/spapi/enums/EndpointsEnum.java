package com.amazon.spapi.enums;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

@Getter
@AllArgsConstructor
public enum EndpointsEnum {
    /**
     * Canada：加拿大（北美）
     */
    CA	("CA",	"A2EUQ1WTGCTBG2",	"https://sellingpartnerapi-na.amazon.com",	"us-east-1"),

    /**
     * United States of America：美国（北美）
     */
    US	("US",	"ATVPDKIKX0DER",	"https://sellingpartnerapi-na.amazon.com",	"us-east-1"),

    /**
     * Mexico：墨西哥（北美）
     */
    MX	("MX",	"A1AM78C64UM0Y8",	"https://sellingpartnerapi-na.amazon.com",	"us-east-1"),

    /**
     * Brazil：巴西（北美）
     */
    BR	("BR",	"A2Q3Y263D00KWC",	"https://sellingpartnerapi-na.amazon.com",	"us-east-1"),

    /**
     * Spain：西班牙（欧洲）
     */
    ES	("ES",	"A1RKKUPIHCS9HS",	"https://sellingpartnerapi-eu.amazon.com",	"eu-west-1"),

    BE	("BE",	"AMEN7PMS3EDWL",	"https://sellingpartnerapi-eu.amazon.com",	"eu-west-1"),

    /**
     * United Kingdom：英国（欧洲）
     */
    GB	("GB",	"A1F83G8C2ARO7P",	"https://sellingpartnerapi-eu.amazon.com",	"eu-west-1"),

    /**
     * France：法国（欧洲）
     */
    FR	("FR",	"A13V1IB3VIYZZH",	"https://sellingpartnerapi-eu.amazon.com",	"eu-west-1"),

    /**
     * Netherlands：荷兰（欧洲）
     */
    NL	("NL",	"A1805IZSGTT6HS",	"https://sellingpartnerapi-eu.amazon.com",	"eu-west-1"),

    /**
     * Germany：德国（欧洲）
     */
    DE	("DE",	"A1PA6795UKMFR9",	"https://sellingpartnerapi-eu.amazon.com",	"eu-west-1"),

    /**
     * Italy：意大利（欧洲）
     */
    IT	("IT",	"APJ6JRA9NG5V4",	"https://sellingpartnerapi-eu.amazon.com",	"eu-west-1"),

    /**
     * Sweden：瑞典（欧洲）
     */
    SE	("SE",	"A2NODRKZP88ZB9",	"https://sellingpartnerapi-eu.amazon.com",	"eu-west-1"),

    /**
     * Poland：波兰（欧洲）
     */
    PL	("PL",	"A1C3SOZRARQ6R3",	"https://sellingpartnerapi-eu.amazon.com",	"eu-west-1"),

    /**
     * Turkey：土耳其（欧洲）
     */
    TR	("TR",	"A33AVAJ2PDY3EV",	"https://sellingpartnerapi-eu.amazon.com",	"eu-west-1"),

    /**
     * United Arab Emirates：阿拉伯联合酋长国（欧洲）
     */
    AE	("AE",	"A2VIGQ35RCS4UG",	"https://sellingpartnerapi-eu.amazon.com",	"eu-west-1"),

    /**
     * India：印度（欧洲）
     */
    IN	("IN",	"A21TJRUUN4KGV",	"https://sellingpartnerapi-eu.amazon.com",	"eu-west-1"),

    /**
     * Saudi Arabia：沙特阿拉伯（欧洲）
     */
    SA	("SA",	"A17E79C6D8DWNP",	"https://sellingpartnerapi-eu.amazon.com",	"eu-west-1"),

    /**
     * UK：英国（欧洲）
     */
    UK	("UK",	"A1F83G8C2ARO7P",	"https://sellingpartnerapi-eu.amazon.com",	"eu-west-1"),

    /**
     * Singapore：新加坡（远东）
     */
    SG	("SG",	"A19VAU5U5O7RUS",	"https://sellingpartnerapi-fe.amazon.com",	"us-west-2"),

    /**
     * Australia：澳大利亚（远东）
     */
    AU	("AU",	"A39IBJ37TRP1C6",	"https://sellingpartnerapi-fe.amazon.com",	"us-west-2"),

    /**
     * Japan：日本（远东）
     */
    JP	("JP",	"A1VC38T7YXB528",	"https://sellingpartnerapi-fe.amazon.com",	"us-west-2");

    /**
     * 国家代码
     */
    private String countryCode;

    /**
     * 区域ID
     */
    private String marketplaceId;

    /**
     * 端点地址
     */
    private String endpoint;

    /**
     * AWS区域
     */
    private String region;

    private static Map<String,EndpointsEnum> EndpointsEnums = new HashMap<>();
    static {
        for (EndpointsEnum value : EndpointsEnum.values()) {
            EndpointsEnums.put(value.getCountryCode(),value);
        }
    }
    public EndpointsEnum find(String countryCode){
        return EndpointsEnums.get(countryCode);
    }
}
