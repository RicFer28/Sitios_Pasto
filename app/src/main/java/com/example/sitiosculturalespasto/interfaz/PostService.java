package com.example.sitiosculturalespasto.interfaz;

import com.example.sitiosculturalespasto.Post;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface PostService {

    String API_ROUTE ="resource/srjm-q6k9.json?$$app_token=6V89pMLtWCjr6dRxuI8TurMHl";

    @GET(API_ROUTE)
    Call<List<Post>> getPost();
}
