package com.example.hirono_mayuko.myapplication;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by hirono-mayuko on 2017/05/31.
 */

public class Visualization {

    @Expose
    @SerializedName("query")
    private Query query;

    public Query getQuery() {
        return query;
    }

    public void setQuery(Query query) {
        this.query = query;
    }
}
