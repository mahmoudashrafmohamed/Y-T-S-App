package com.mahmoud_ashraf.y_t_s_app.webservices;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by mahmoud_ashraf on 7/17/2017.
 */

public class WebService {

    public static WebService instance;
    public API api;

    public WebService() {
        OkHttpClient client = new OkHttpClient.Builder().build();
        Retrofit retrofit = new Retrofit.Builder().client(client)
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl("https://yts.ag/api/v2/")
                .build();
        api = retrofit.create(API.class);

    }

    public static WebService getInstance() {
        if (instance == null) {
            instance = new WebService();
        }
        return instance;
    }

    public API getApi() {
        return api;
    }

}
