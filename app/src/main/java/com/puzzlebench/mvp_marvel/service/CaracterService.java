package com.puzzlebench.mvp_marvel.service;

import android.support.annotation.NonNull;

import com.puzzlebench.mvp_marvel.models.Data;
import com.puzzlebench.mvp_marvel.models.MarvelResponse;
import com.puzzlebench.mvp_marvel.models.Result;

import java.io.IOException;
import java.util.ArrayList;

import io.reactivex.Observable;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import retrofit2.Response;


/**
 * Created by andresdavid on 21/02/17.
 */

public class CaracterService {

    public void getCaracters(@NonNull Observer<ArrayList<Result>> observer) {

        Observable.create((ObservableOnSubscribe<ArrayList<Result>>) observableEmitter -> {
            try {
                CaracterClient client = ServiceGenerator.createService(CaracterClient.class);
                Response<MarvelResponse<Data<ArrayList<Result>>>> response = client.getCharacter().execute();
                observableEmitter.onNext(response.body().getData().getResults());

            } catch (IOException ex) {
                observableEmitter.onError(ex);
            }
            observableEmitter.onComplete();
        }).subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(observer);


    }

}
