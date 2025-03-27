package com.amazon.spapi.enums;

import com.amazon.spapi.model.fulfillmentinbound.LabelPrepType;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;

/**
 * @author: ty
 * @description: PageType枚举类
 * @date: 2021/8/11
 */
@JsonAdapter(PageTypeEnum.Adapter.class)
public enum PageTypeEnum {

    /**
     * 每个 US Letter 标签纸有两个标签。这是在美国使用联合包裹服务 (UPS) 作为承运人的亚马逊合作货件的唯一有效值。在加拿大和美国得到支持。
     */
    PackageLabel_Letter_2("PackageLabel_Letter_2"),

    /**
     * 每个 US Letter 标签纸有四个标签。这是美国非亚马逊合作货件的唯一有效值。在加拿大和美国得到支持。
     */
    PackageLabel_Letter_4("PackageLabel_Letter_4"),

    /**
     * 每个 US Letter 标签纸有六个标签。这是美国非亚马逊合作货件的唯一有效值。在加拿大和美国得到支持。
     */
    PackageLabel_Letter_6("PackageLabel_Letter_6"),

    /**
     * 每个 US Letter 标签纸有六个标签在左边
     */
    PackageLabel_Letter_6_CarrierLeft("PackageLabel_Letter_6_CarrierLeft"),

    /**
     * 每张 A4 标签纸有两个标签。
     */
    PackageLabel_A4_2("PackageLabel_A4_2"),

    /**
     * 每张 A4 标签纸有四个标签。
     */
    PackageLabel_A4_4("PackageLabel_A4_4"),

    /**
     * 每张美国信纸一个标签。仅适用于非亚马逊合作的货件。
     */
    PackageLabel_Plain_Paper("PackageLabel_Plain_Paper"),

    /**
     * 每张美国信纸一个标签，在底部。
     */
    PackageLabel_Plain_Paper_CarrierBottom("PackageLabel_Plain_Paper_CarrierBottom"),

    /**
     * 用于热敏打印机。支持亚马逊与 UPS 合作的货件。
     */
    PackageLabel_Thermal("PackageLabel_Thermal"),

    /**
     * 用于热敏打印机。支持使用 ATS 发货。
     */
    PackageLabel_Thermal_Unified("PackageLabel_Thermal_Unified"),

    /**
     * 用于热敏打印机。支持非亚马逊合作的货件。
     */
    PackageLabel_Thermal_NonPCP("PackageLabel_Thermal_NonPCP"),

    /**
     * 用于热敏打印机。支持亚马逊与 DHL 合作的货件。
     */
    PackageLabel_Thermal_No_Carrier_Rotation("PackageLabel_Thermal_No_Carrier_Rotation");

    private String value;

    PageTypeEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static PageTypeEnum fromValue(String text) {
        for (PageTypeEnum b : PageTypeEnum.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        return null;
    }

    public static class Adapter extends TypeAdapter<PageTypeEnum> {
        @Override
        public void write(final JsonWriter jsonWriter, final PageTypeEnum enumeration) throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public PageTypeEnum read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return PageTypeEnum.fromValue(String.valueOf(value));
        }
    }
}
