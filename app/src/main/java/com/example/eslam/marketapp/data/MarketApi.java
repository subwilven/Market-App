package com.example.eslam.marketapp.data;

import com.example.eslam.marketapp.pojo.Brand;
import com.example.eslam.marketapp.pojo.Category;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface MarketApi {
    @GET("/v2/everything")
    Call<Brand> fetchBrands(@Query("q") String q,
                            @Query("apiKey") String apiKey,
                            @Query("page") long page,
                            @Query("pageSize") int pageSize);

    @GET("/v2/everything")
    Call<Category> fetchCategories(@Query("q") String q,
                             @Query("apiKey") String apiKey,
                             @Query("page") long page,
                             @Query("pageSize") int pageSize);
}
