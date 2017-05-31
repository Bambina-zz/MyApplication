package com.example.hirono_mayuko.myapplication;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by hirono-mayuko on 2017/05/31.
 */

public class Query {

    @Expose
    @SerializedName("id")
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
