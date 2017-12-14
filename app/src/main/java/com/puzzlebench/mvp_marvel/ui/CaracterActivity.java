package com.puzzlebench.mvp_marvel.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.puzzlebench.mvp_marvel.R;
import com.puzzlebench.mvp_marvel.mvp.model.CaracterModel;
import com.puzzlebench.mvp_marvel.mvp.presenter.CaracterPresenter;
import com.puzzlebench.mvp_marvel.mvp.view.CaracterView;
import com.puzzlebench.mvp_marvel.service.ServiceUtils;

import butterknife.ButterKnife;

public class CaracterActivity extends AppCompatActivity {

    CaracterPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        presenter = new CaracterPresenter(new CaracterModel(ServiceUtils.getItemService()),
                new CaracterView(this));
        presenter.init();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

}
