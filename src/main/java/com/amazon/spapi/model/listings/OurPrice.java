package com.amazon.spapi.model.listings;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.util.List;

/**
 * <Description> <br>
 *
 * @author supoman<br>
 * @version 1.0<br>
 * @date 2023/05/11 <br>
 */
@Data
public class OurPrice{
    @SerializedName("schedule")
    private List<Schedule> schedule;
}
