package com.example.hirono_mayuko.myapplication;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by hirono-mayuko on 2017/05/31.
 */

public class Dashboard {

    @Expose
    @SerializedName("slug")
    private String mSlug;

    @Expose
    @SerializedName("name")
    private String mName;

    @Expose
    @SerializedName("widgets")
    private List<List<Widget>> widgets;

    private List<String> queryIds;

    public Dashboard(){
    }

    public String getmSlug() {
        return mSlug;
    }

    public void setmSlug(String mSlug) {
        this.mSlug = mSlug;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public List<List<Widget>> getWidgets() {
        return widgets;
    }

    public void setWidgets(List<List<Widget>> widgets) {
        this.widgets = widgets;
    }

    public List<String> getQueryIds() {
        return queryIds;
    }

    public void setQueryIds(List<String> queryIds) {
        this.queryIds = queryIds;
    }

    public void collectQueryIds(){
        for(List<Widget> list:widgets){
            for(Widget w:list){
                if(w.getVisualization() != null){
                    queryIds.add(w.getVisualization().getQuery().getId());
                }
            }
        }
    }
}
