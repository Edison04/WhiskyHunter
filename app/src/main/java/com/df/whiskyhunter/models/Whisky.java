package com.df.whiskyhunter.models;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Whisky implements Serializable {
    @SerializedName("name")
    private String nameWhisky;

    @SerializedName("slug")
    private String slugWhisky;

    @SerializedName("url")
    private String urlWhisky;

    @SerializedName("buyers_fee")
    private String buyersFeeWhisky;

    @SerializedName("sellers_fee")
    private String sellersFeeWhisky;

    @SerializedName("reserve_fee")
    private String reserveFeeWhisky;

    @SerializedName("listing_fee")
    private String listingFeeWhisky;

    @SerializedName("base_currency")
    private String baseCurrencyWhisky;

    public Whisky(String nameWhisky, String slugWhisky, String urlWhisky, String buyersFeeWhisky,
                  String sellersFeeWhisky, String reserveFeeWhisky, String listingFeeWhisky,
                  String baseCurrencyWhisky) {
        this.nameWhisky = nameWhisky;
        this.slugWhisky = slugWhisky;
        this.urlWhisky = urlWhisky;
        this.buyersFeeWhisky = buyersFeeWhisky;
        this.sellersFeeWhisky = sellersFeeWhisky;
        this.reserveFeeWhisky = reserveFeeWhisky;
        this.listingFeeWhisky = listingFeeWhisky;
        this.baseCurrencyWhisky = baseCurrencyWhisky;
    }

    public String getNameWhisky() {
        return nameWhisky;
    }

    public void setNameWhisky(String nameWhisky) {
        this.nameWhisky = nameWhisky;
    }

    public String getSlugWhisky() {
        return slugWhisky;
    }

    public void setSlugWhisky(String slugWhisky) {
        this.slugWhisky = slugWhisky;
    }

    public String getUrlWhisky() {
        return urlWhisky;
    }

    public void setUrlWhisky(String urlWhisky) {
        this.urlWhisky = urlWhisky;
    }

    public String getBuyersFeeWhisky() {
        return buyersFeeWhisky;
    }

    public void setBuyersFeeWhisky(String buyersFeeWhisky) {
        this.buyersFeeWhisky = buyersFeeWhisky;
    }

    public String getSellersFeeWhisky() {
        return sellersFeeWhisky;
    }

    public void setSellersFeeWhisky(String sellersFeeWhisky) {
        this.sellersFeeWhisky = sellersFeeWhisky;
    }

    public String getReserveFeeWhisky() {
        return reserveFeeWhisky;
    }

    public void setReserveFeeWhisky(String reserveFeeWhisky) {
        this.reserveFeeWhisky = reserveFeeWhisky;
    }

    public String getListingFeeWhisky() {
        return listingFeeWhisky;
    }

    public void setListingFeeWhisky(String listingFeeWhisky) {
        this.listingFeeWhisky = listingFeeWhisky;
    }

    public String getBaseCurrencyWhisky() {
        return baseCurrencyWhisky;
    }

    public void setBaseCurrencyWhisky(String baseCurrencyWhisky) {
        this.baseCurrencyWhisky = baseCurrencyWhisky;
    }
}
