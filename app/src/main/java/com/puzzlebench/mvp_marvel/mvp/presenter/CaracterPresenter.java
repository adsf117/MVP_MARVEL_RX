package com.puzzlebench.mvp_marvel.mvp.presenter;

import com.puzzlebench.mvp_marvel.adapters.CaracterAdapter;
import com.puzzlebench.mvp_marvel.models.Result;
import com.puzzlebench.mvp_marvel.mvp.model.CaracterModel;
import com.puzzlebench.mvp_marvel.mvp.view.CaracterView;

import java.util.ArrayList;

import io.reactivex.observers.DisposableObserver;

/**
 * Created by andresdavid on 21/02/17.
 */

public class CaracterPresenter {

    private CaracterModel model;
    private CaracterView view;

    public CaracterPresenter(CaracterModel caracterModel, CaracterView caracterView) {
        this.model = caracterModel;
        this.view = caracterView;
        init();
    }

    private void init() {
        view.showProgressBar();
        model.getCaracters(new DisposableObserver<ArrayList<Result>>() {
            @Override
            public void onNext(ArrayList<Result> results) {
                view.hideProgressBar();
                view.setAdapter(new CaracterAdapter(results));
            }

            @Override
            public void onError(Throwable e) {
                view.showError();
                view.hideProgressBar();
            }

            @Override
            public void onComplete() {
                view.hideProgressBar();
            }
        });
    }


}
