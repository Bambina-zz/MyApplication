package com.example.hirono_mayuko.myapplication;

import io.reactivex.Observable;

/**
 * Created by hirono-mayuko on 2017/05/31.
 */

public interface Api {
    Observable<Dashboard> getDashboard(String dashboard, String apiKey);
    Observable<Widget> getQueryData(String queryId, String apiKey);
}
