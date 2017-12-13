package com.puzzlebench.mvp_marvel.mvp.model;

import android.support.annotation.NonNull;

import com.puzzlebench.mvp_marvel.models.Result;
import com.puzzlebench.mvp_marvel.service.CaracterService;

import java.util.ArrayList;

import io.reactivex.Observer;

/**
 * Created by andresdavid on 21/02/17.
 */

public class CaracterModel {

    private CaracterService caracterService;

    public CaracterModel(CaracterService caracterService) {
        this.caracterService = caracterService;
    }

    public void getCaracters(@NonNull Observer<ArrayList<Result>> observer) {
        caracterService.getCaracters(observer);
    }
}
