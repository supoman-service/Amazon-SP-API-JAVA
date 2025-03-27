package com.amazon.spapi.model.listings;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

/**
 * <Description> <br>
 *
 * @author Amte Ma<br>
 * @version 1.0<br>
 * @date 2023/05/11 <br>
 */
@Data
public class Schedule {
    @SerializedName("value_with_tax")
    private double valueWithTax;
}
