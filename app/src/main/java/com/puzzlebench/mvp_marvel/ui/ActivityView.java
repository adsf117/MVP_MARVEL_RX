package com.puzzlebench.mvp_marvel.ui;

import android.content.Context;
import android.content.res.Resources;
import android.support.annotation.Nullable;

import java.lang.ref.WeakReference;

/**
 * Created by andresdavid on 21/02/17.
 */

public class ActivityView <T> {
    private WeakReference<T> activityReference;

    public ActivityView(T activity) {
        activityReference = new WeakReference<>(activity);
    }

    @Nullable
    public T getActivity() {
        return activityReference.get();
    }

    @Nullable
    public Context getContext() {
        return (Context) getActivity();
    }

    public Resources getResources() {
        return getContext().getResources();
    }

}
