package com.puzzlebench.mvp_marvel.service;

/**
 * Created by andresdavid on 15/01/17.
 */

public class MarvelCostantsApi {

    public static final String BASE_URL = "http://gateway.marvel.com/public/";
    private static final String VERSION = "/v1";
    private static final String API_TYPE = "/public";
    private static final String SECTION = "/characters";
    public static final String PRIVATE_API_KEY_ARG = "hash";
    public static final String PUBLIC_API_KEY_ARG = "apikey";
    public static final String TS = "ts";
    public static final String TS_VALUE = "1";
    public static final String querry = VERSION + API_TYPE + SECTION;
}
