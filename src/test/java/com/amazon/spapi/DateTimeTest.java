package com.amazon.spapi;


import cn.hutool.core.date.DateUtil;
import com.fasterxml.jackson.core.format.DataFormatDetector;
import lombok.var;
import org.joda.time.format.DateTimeFormatter;
import org.junit.Ignore;
import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.Date;
import java.util.TimeZone;

@Ignore
public class DateTimeTest {
    @Test
    public void t1() throws ParseException {
        System.out.println(org.threeten.bp.OffsetDateTime.of(2023, 12, 10, 3, 49, 9, 0, org.threeten.bp.ZoneOffset.ofHours(0)));
        System.out.println( org.threeten.bp.OffsetDateTime.now().toString());
        System.out.println(LocalDate.now().format(java.time.format.DateTimeFormatter.ofPattern("yyyyMMdd")));
        System.out.println(DateUtil.parse("2023-03-28T22:24:57Z"));

        String dateStr = "2023-03-28T19:17:40Z";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
        sdf.setTimeZone(TimeZone.getTimeZone("GMT+8"));
        Date date = sdf.parse(dateStr);
        System.out.println(date);

        System.out.println(DateUtil.parse(dateStr));
    }

    @Test
    public void  t2(){


        org.threeten.bp.OffsetDateTime fromThirdParty
                = org.threeten.bp.OffsetDateTime.of(2021, 5, 1, 0, 0, 0, 0, org.threeten.bp.ZoneOffset.ofHours(0));

        java.time.Instant jtInstant = java.time.Instant
                .ofEpochSecond(fromThirdParty.toEpochSecond(), fromThirdParty.getNano());

        java.time.ZoneOffset jtOffset = java.time.ZoneOffset.ofTotalSeconds(
                fromThirdParty.getOffset().getTotalSeconds());

        java.time.OffsetDateTime converted
                = java.time.OffsetDateTime.ofInstant(jtInstant, jtOffset);

        var  pm= fromThirdParty.plusMonths(1).plusSeconds(-1);

        System.out.println("From " + fromThirdParty);
        System.out.println("To   " + converted);
        System.out.println(pm);

    }
    @Test
    public void d3(){
        var d=LocalDate.now();
        System.out.println(d.getYear());
        System.out.println(d.getMonth());
        System.out.println(d.getMonthValue()-1);
        System.out.println(d.getDayOfMonth());

    }

    @Test
    public void t3(){
        String myFeedData = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
                "<AmazonEnvelope xsi:noNamespaceSchemaLocation=\"amzn-envelope.xsd\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\">\n" +
                "    <Header>\n" +
                "        <DocumentVersion>1.01</DocumentVersion>\n" +
                "        <MerchantIdentifier>A2HWWYO1E71F7i</MerchantIdentifier>\n" +
                "    </Header>\n" +
                "    <MessageType>Product</MessageType>\n" +
                "    <Message>\n" +
                "        <MessageID>1</MessageID>\n" +
                "        <OperationType>Update</OperationType>\n" +
                "        <Product>\n" +
                "            <SKU>963772741</SKU>\n" +
                "            <Condition>\n" +
                "                <ConditionType>New</ConditionType>\n" +
                "            </Condition>\n" +
                "            <DescriptionData>\n" +
                "                <Title>TestBrand 测试品牌 牛奶面包 12345 </Title>\n" +
                "                <Brand>TestBrand 测试品牌</Brand>\n" +
                "                <Description>TestCompany全新推出更具潮流气息的短袖POLO衫,时尚简约的款式,考究精致的版型,质感和颜色同时抢眼夺目,让您英姿飒爽,尽显帅气风采</Description>\n" +
                "                <Manufacturer>TestCompany</Manufacturer>\n" +
                "                <RecommendedBrowseNode>2154320512</RecommendedBrowseNode>\n" +
                "                <RecommendedBrowseNode>21545310512</RecommendedBrowseNode>\n" +
                "            </DescriptionData>\n" +
                "            <ProductData>\n" +
                "                <Clothing>\n" +
                "                    <VariationData>\n" +
                "                        <Parentage>parent</Parentage>\n" +
                "                        <VariationTheme>SizeColor</VariationTheme>\n" +
                "                    </VariationData>\n" +
                "                    <ClassificationData>\n" +
                "                        <ClothingType>Shirt</ClothingType>\n" +
                "                        <Department>男式</Department>\n" +
                "                        <StyleKeywords>花纹</StyleKeywords>\n" +
                "                        <OuterMaterial>棉</OuterMaterial>\n" +
                "                        <CountryOfOrigin>cn</CountryOfOrigin>\n" +
                "                        <RegionOfOrigin>中国</RegionOfOrigin>\n" +
                "                    </ClassificationData>\n" +
                "                </Clothing>\n" +
                "            </ProductData>\n" +
                "        </Product>\n" +
                "    </Message>\n" +
                "</AmazonEnvelope>\n";
        System.out.println(myFeedData);
    }

}
