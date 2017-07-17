package com.mahmoud_ashraf.y_t_s_app.webservices;

import com.mahmoud_ashraf.y_t_s_app.model.movies;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by mahmoud_ashraf on 7/17/2017.
 */

public interface API {

    @GET("list_movies.json?limit=10")
    Call<movies> getListByPage(@Query("page") int p);

}
