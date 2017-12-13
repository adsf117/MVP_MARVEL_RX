package com.puzzlebench.mvp_marvel.service;


/**
 * Created by andresdavid on 21/02/17.
 */

public class ServiceUtils {

    private static CaracterService caracterService;

    private ServiceUtils() {
    }

    public static final CaracterService getItemService() {
        if (caracterService == null) {
            caracterService = new CaracterService();
        }
        return caracterService;
    }
}
