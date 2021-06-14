package com.df.whiskyhunter.ApiManager;

import com.df.whiskyhunter.models.Distillery;
import com.df.whiskyhunter.models.Whisky;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Api {
    String BASE_URL = "https://whiskyhunter.net/api/";

    @GET("auctions_info")
    Call<List<Whisky>> getWhiskys();

    @GET("distilleries_info")
    Call<List<Distillery>> getDistilleries();
}
