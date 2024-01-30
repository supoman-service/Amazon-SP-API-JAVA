package com.amazon.spapi.enums;

import com.amazon.spapi.model.fulfillmentinbound.LabelPrepType;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;

/**
 * @author: supoman
 * @description: LabelType枚举类
 * @date: 2021/8/11
 */
@JsonAdapter(LabelTypeEnum.Adapter.class)
public enum LabelTypeEnum {
    /**
     * 2D条码：此选项仅适用于将 2D 条码应用于所有包裹的货件。亚马逊强烈建议使用 UNIQUE 选项而不是 BARCODE_2D 选项来获取包裹标签。
     */
    BARCODE_2D("BARCODE_2D"),

    /**
     * 唯一：用于打印入库货件的唯一货件标签和承运商标签的文档数据
     */
    UNIQUE("UNIQUE"),

    /**
     * 托盘：用于打印零担/整车 (LTL/FTL) 入库货件的托盘标签的文档数据。
     */
    PALLET("PALLET");

    private String value;

    LabelTypeEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static LabelTypeEnum fromValue(String text) {
        for (LabelTypeEnum b : LabelTypeEnum.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        return null;
    }

    public static class Adapter extends TypeAdapter<LabelTypeEnum> {
        @Override
        public void write(final JsonWriter jsonWriter, final LabelTypeEnum enumeration) throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public LabelTypeEnum read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return LabelTypeEnum.fromValue(String.valueOf(value));
        }
    }
}
