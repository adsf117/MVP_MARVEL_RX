package com.puzzlebench.mvp_marvel.service.api;

import com.puzzlebench.mvp_marvel.models.Data;
import com.puzzlebench.mvp_marvel.models.MarvelResponse;
import com.puzzlebench.mvp_marvel.models.Characters;
import com.puzzlebench.mvp_marvel.service.MarvelCostantsApi;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by andresdavid on 21/02/17.
 */

public interface CaracterClient {
    @GET(MarvelCostantsApi.querry)
    Call<MarvelResponse<Data<ArrayList<Characters>>>> getCharacter();
}
