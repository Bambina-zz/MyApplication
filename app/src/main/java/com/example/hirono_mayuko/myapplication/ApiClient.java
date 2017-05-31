package com.example.hirono_mayuko.myapplication;

import io.reactivex.Observable;
import retrofit2.Retrofit;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by hirono-mayuko on 2017/05/31.
 */

public class ApiClient implements Api {
    interface Service {
        @GET("/api/dashboards/{dashboard}")
        Observable<Dashboard> getDashboard(@Path("dashboard") String dashboard,
                                           @Query("api_key") String apiKey);

        @GET("/api/queries/{queryId}/results.json")
        Observable<Widget> getQueryData(@Path("queryId") String queryId,
                                        @Query("api_key") String apiKey);
    }

    private final Service service;

    public ApiClient(Retrofit retrofit){
        this.service = retrofit.create(Service.class);
    }

    @Override
    public Observable<Dashboard> getDashboard(String dashboard, String apiKey){
        return service.getDashboard(dashboard, apiKey);
    }

    @Override
    public Observable<Widget >getQueryData(String queryId, String apiKey){
        return service.getQueryData(queryId, apiKey);
    }
}
