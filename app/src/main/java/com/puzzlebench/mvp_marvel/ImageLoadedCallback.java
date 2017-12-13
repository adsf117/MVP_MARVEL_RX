package com.puzzlebench.mvp_marvel;

import android.widget.ProgressBar;

import com.squareup.picasso.Callback;

/**
 * Created by andresdavid on 21/02/17.
 */

public class ImageLoadedCallback implements Callback {
    ProgressBar progressBar;

    public  ImageLoadedCallback(ProgressBar progBar){
        progressBar = progBar;
    }

    @Override
    public void onSuccess() {

    }

    @Override
    public void onError() {

    }
}
