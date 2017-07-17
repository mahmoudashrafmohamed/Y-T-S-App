package com.mahmoud_ashraf.y_t_s_app.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by mahmoud_ashraf on 7/17/2017.
 */

public class movies {


    @SerializedName("status")
    public String status;
    @SerializedName("status_message")
    public String status_message;
    @SerializedName("data")
    public Data data;

    public static class Torrents {
        @SerializedName("url")
        public String url;
        @SerializedName("hash")
        public String hash;
        @SerializedName("quality")
        public String quality;
        @SerializedName("seeds")
        public int seeds;
        @SerializedName("peers")
        public int peers;
        @SerializedName("size")
        public String size;
        @SerializedName("size_bytes")
        public int size_bytes;
        @SerializedName("date_uploaded")
        public String date_uploaded;
        @SerializedName("date_uploaded_unix")
        public int date_uploaded_unix;
    }

    public static class Movies {
        @SerializedName("id")
        public int id;
        @SerializedName("url")
        public String url;
        @SerializedName("imdb_code")
        public String imdb_code;
        @SerializedName("title")
        public String title;
        @SerializedName("title_english")
        public String title_english;
        @SerializedName("title_long")
        public String title_long;
        @SerializedName("slug")
        public String slug;
        @SerializedName("year")
        public int year;
        @SerializedName("rating")
        public double rating;
        @SerializedName("runtime")
        public int runtime;
        @SerializedName("summary")
        public String summary;
        @SerializedName("description_full")
        public String description_full;
        @SerializedName("synopsis")
        public String synopsis;
        @SerializedName("yt_trailer_code")
        public String yt_trailer_code;
        @SerializedName("language")
        public String language;
        @SerializedName("mpa_rating")
        public String mpa_rating;
        @SerializedName("background_image")
        public String background_image;
        @SerializedName("background_image_original")
        public String background_image_original;
        @SerializedName("small_cover_image")
        public String small_cover_image;
        @SerializedName("medium_cover_image")
        public String medium_cover_image;
        @SerializedName("large_cover_image")
        public String large_cover_image;
        @SerializedName("state")
        public String state;

        @SerializedName("date_uploaded")
        public String date_uploaded;
        @SerializedName("date_uploaded_unix")
        public int date_uploaded_unix;
    }

    public static class Data {
        @SerializedName("movie_count")
        public int movie_count;
        @SerializedName("limit")
        public int limit;
        @SerializedName("page_number")
        public int page_number;
        @SerializedName("movies")
        public List<Movies> movies;
    }
}

