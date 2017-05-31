package com.example.hirono_mayuko.myapplication;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by hirono-mayuko on 2017/05/31.
 */

public class Widget {

    @Expose
    @SerializedName("visualization")
    private Visualization visualization;

    public Visualization getVisualization() {
        return visualization;
    }

    public void setVisualization(Visualization visualization) {
        this.visualization = visualization;
    }
}
