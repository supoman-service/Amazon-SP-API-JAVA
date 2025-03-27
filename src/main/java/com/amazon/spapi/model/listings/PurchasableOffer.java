package com.amazon.spapi.model.listings;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.util.List;

/**
 * <Description> <br>
 *
 * @author Amte Ma<br>
 * @version 1.0<br>
 * @date 2023/05/11 <br>
 */
@Data
public class PurchasableOffer {
    @SerializedName("currency")
    private String currency;
    @SerializedName("our_price")
    private List<OurPrice> ourPrice;
    @SerializedName("marketplace_id")
    private String marketplaceId;


}
