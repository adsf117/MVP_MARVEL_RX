package com.puzzlebench.mvp_marvel.models;

import com.google.gson.annotations.SerializedName;

/**
 * Created by andresdavid on 21/02/17.
 */

public class Data<T> {

    private int offset;
    private int limit;
    private int total;
    @SerializedName("results")
    private T results;

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public T getResults() {
        return results;
    }

    public void setResults(T results) {
        this.results = results;
    }
}
