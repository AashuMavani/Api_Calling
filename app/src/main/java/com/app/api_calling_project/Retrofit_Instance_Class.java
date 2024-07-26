package com.app.api_calling_project;


import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Retrofit_Instance_Class {

    private static Retrofit retrofit;
    private static final String BASEURL = "https://jsonplaceholder.typicode.com/";

    public static Retrofit getRetrofit() {

        if (retrofit == null) {
            retrofit = new Retrofit.Builder().
                    baseUrl(BASEURL).addConverterFactory(GsonConverterFactory.create()).
                    build();
        }

        return retrofit;
    }


}
