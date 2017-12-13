package com.puzzlebench.mvp_marvel.service;

import com.puzzlebench.mvp_marvel.models.Data;
import com.puzzlebench.mvp_marvel.models.MarvelResponse;
import com.puzzlebench.mvp_marvel.models.Result;
import com.puzzlebench.mvp_marvel.service.api.MarvelCostantsApi;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by andresdavid on 21/02/17.
 */

public interface CaracterClient {
    @GET(MarvelCostantsApi.querry)
    Call<MarvelResponse<Data<ArrayList<Result>>>> getCharacter();
}
