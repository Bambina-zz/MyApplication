package com.example.hirono_mayuko.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.disposables.Disposables;
import io.reactivex.schedulers.Schedulers;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    private static final String END_POINT = "https://demo.redash.io";
    private static final String API_KEY = "xxxxx";

    Disposable d = Disposables.empty();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Retrofit retrofit = new Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .baseUrl(END_POINT)
                .build();

        RedashApi redashApi = retrofit.create(RedashApi.class);

        redashApi.getDashboard("ipros-demo", API_KEY)
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(
                        dashboard -> System.out.println(dashboard.getName()),
                        Throwable::printStackTrace);
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        d.dispose();
    }
}
