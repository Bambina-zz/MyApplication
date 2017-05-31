package com.example.hirono_mayuko.myapplication;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by hirono-mayuko on 2017/05/31.
 */

public interface RedashApi {

    @GET("/api/dashboards/{dashboard}")
    Observable<Dashboard> getDashboard(@Path("dashboard") String dashboard, @Query("api_key") String apiKey);

}
