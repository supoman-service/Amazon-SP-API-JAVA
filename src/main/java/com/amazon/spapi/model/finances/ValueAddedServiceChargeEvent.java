package com.amazon.spapi.model.finances;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

/**
 * <Description> <br>
 *
 * @author supoman<br>
 * @version 1.0<br>
 * @date 2023/04/21 <br>
 */
@ApiModel(description = "An event related to a trial shipment.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-04-21T12:22:28.126+08:00")
public class ValueAddedServiceChargeEvent {
    @SerializedName("TransactionType")
    private String transactionType = null;

    @SerializedName("PostedDate")
    private String postedDate = null;

    @SerializedName("Description")
    private String description = null;

    @SerializedName("TransactionAmount")
    private Currency transactionAmount = null;

    public ValueAddedServiceChargeEvent transactionType(String transactionType) {
        this.transactionType = transactionType;
        return this;
    }

    /**
     * Indicates the type of transaction.  Example: &#39;Other Support Service fees&#39;
     * @return transactionType
     **/
    @ApiModelProperty(value = "Indicates the type of transaction.  Example: 'Other Support Service fees'")
    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public ValueAddedServiceChargeEvent postedDate(String postedDate) {
        this.postedDate = postedDate;
        return this;
    }

    /**
     * The date and time when the financial event was posted.
     * @return postedDate
     **/
    @ApiModelProperty(value = "The date and time when the financial event was posted.")
    public String getPostedDate() {
        return postedDate;
    }

    public void setPostedDate(String postedDate) {
        this.postedDate = postedDate;
    }

    public ValueAddedServiceChargeEvent description(String description) {
        this.description = description;
        return this;
    }

    /**
     * A short description of the service charge event.
     * @return description
     **/
    @ApiModelProperty(value = "A short description of the service charge event.")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ValueAddedServiceChargeEvent transactionAmount(Currency transactionAmount) {
        this.transactionAmount = transactionAmount;
        return this;
    }

    /**
     * The amount of the service charge event.
     * @return transactionAmount
     **/
    @ApiModelProperty(value = "The amount of the service charge event.")
    public Currency getTransactionAmount() {
        return transactionAmount;
    }

    public void setTransactionAmount(Currency transactionAmount) {
        this.transactionAmount = transactionAmount;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ValueAddedServiceChargeEvent valueAddedServiceChargeEvent = (ValueAddedServiceChargeEvent) o;
        return Objects.equals(this.transactionType, valueAddedServiceChargeEvent.transactionType) &&
                Objects.equals(this.postedDate, valueAddedServiceChargeEvent.postedDate) &&
                Objects.equals(this.description, valueAddedServiceChargeEvent.description) &&
                Objects.equals(this.transactionAmount, valueAddedServiceChargeEvent.transactionAmount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(transactionType, postedDate, description, transactionAmount);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ValueAddedServiceChargeEvent {\n");

        sb.append("    transactionType: ").append(toIndentedString(transactionType)).append("\n");
        sb.append("    postedDate: ").append(toIndentedString(postedDate)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    transactionAmount: ").append(toIndentedString(transactionAmount)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
