package com.puzzlebench.mvp_marvel.mvp.presenter;

import com.puzzlebench.mvp_marvel.adapters.CaracterAdapter;
import com.puzzlebench.mvp_marvel.models.Characters;
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
    }

    public void showMessage(String caracterName) {
        view.showMessage(caracterName);
    }

    public void init() {
        view.init();
        model.getCaracters(new DisposableObserver<ArrayList<Characters>>() {
            @Override
            public void onNext(ArrayList<Characters> results) {
                view.hideProgressBar();
                CaracterAdapter adapter = new CaracterAdapter(results);
                adapter.getViewClickedObservable()
                        .subscribe(result -> showMessage(result.getName()));
                view.setAdapter(adapter);
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
