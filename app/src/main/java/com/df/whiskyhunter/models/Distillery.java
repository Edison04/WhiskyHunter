package com.df.whiskyhunter.models;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Distillery implements Serializable {
    @SerializedName("name")
    private String nameDistillery;

    @SerializedName("slug")
    private String slugDistillery;

    @SerializedName("country")
    private String countryDistillery;

    @SerializedName("whiskybase_whiskies")
    private String whiskybase_whiskiesDistillery;

    @SerializedName("whiskybase_votes")
    private String whiskybase_votesDistillery;

    @SerializedName("whiskybase_rating")
    private String whiskybase_ratingDistillery;

    public Distillery(String nameDistillery, String slugDistillery, String countryDistillery,
                      String whiskybase_whiskiesDistillery, String whiskybase_votesDistillery,
                      String whiskybase_ratingDistillery) {
        this.nameDistillery = nameDistillery;
        this.slugDistillery = slugDistillery;
        this.countryDistillery = countryDistillery;
        this.whiskybase_whiskiesDistillery = whiskybase_whiskiesDistillery;
        this.whiskybase_votesDistillery = whiskybase_votesDistillery;
        this.whiskybase_ratingDistillery = whiskybase_ratingDistillery;
    }

    public String getNameDistillery() {
        return nameDistillery;
    }

    public void setNameDistillery(String nameDistillery) {
        this.nameDistillery = nameDistillery;
    }

    public String getSlugDistillery() {
        return slugDistillery;
    }

    public void setSlugDistillery(String slugDistillery) {
        this.slugDistillery = slugDistillery;
    }

    public String getCountryDistillery() {
        return countryDistillery;
    }

    public void setCountryDistillery(String countryDistillery) {
        this.countryDistillery = countryDistillery;
    }

    public String getWhiskybase_whiskiesDistillery() {
        return whiskybase_whiskiesDistillery;
    }

    public void setWhiskybase_whiskiesDistillery(String whiskybase_whiskiesDistillery) {
        this.whiskybase_whiskiesDistillery = whiskybase_whiskiesDistillery;
    }

    public String getWhiskybase_votesDistillery() {
        return whiskybase_votesDistillery;
    }

    public void setWhiskybase_votesDistillery(String whiskybase_votesDistillery) {
        this.whiskybase_votesDistillery = whiskybase_votesDistillery;
    }

    public String getWhiskybase_ratingDistillery() {
        return whiskybase_ratingDistillery;
    }

    public void setWhiskybase_ratingDistillery(String whiskybase_ratingDistillery) {
        this.whiskybase_ratingDistillery = whiskybase_ratingDistillery;
    }
}
