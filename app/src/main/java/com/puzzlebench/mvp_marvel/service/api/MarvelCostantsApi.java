package com.puzzlebench.mvp_marvel.service.api;

/**
 * Created by andresdavid on 15/01/17.
 */

public class MarvelCostantsApi {

    public static final String BASE_URL = "http://gateway.marvel.com/public/";
    public static final String VERSION = "/v1";
    public static final String API_TYPE = "/public";
    public static final String SECTION = "/characters";
    public static final String PRIVATE_API_KEY_ARG = "hash";
    public static final String PUBLIC_API_KEY_ARG = "apikey";
    public static final String TS = "ts";
    public static final String TS_VALUE = "1";
    public static final String querry = VERSION + API_TYPE + SECTION;
    // TODO move this into buildConfig
    public static final String PRIVATE_API_KEY_VALUE = "d6e634e314a819ca1c0f0078344acb70";
    public static final String PUBLIC_API_KEY_VALUE = "504e22423d24b530dd878fdf808fc001";
}
