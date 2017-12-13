package com.puzzlebench.mvp_marvel.service;

import com.puzzlebench.mvp_marvel.service.api.MarvelCostantsApi;

import java.io.IOException;

import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by andresdavid on 21/02/17.
 */

public class ServiceGenerator {

    private static OkHttpClient.Builder httpClient = new OkHttpClient.Builder().addInterceptor(new Interceptor() {
        @Override
        public Response intercept(Chain chain) throws IOException {
            Request  defaultRequest = chain.request();

            HttpUrl defaulthttpUrl = defaultRequest.url();
            HttpUrl httpUrl = defaulthttpUrl.newBuilder()
                    .addQueryParameter(MarvelCostantsApi.PRIVATE_API_KEY_ARG,MarvelCostantsApi.PRIVATE_API_KEY_VALUE)
                    .addQueryParameter(MarvelCostantsApi.PUBLIC_API_KEY_ARG,MarvelCostantsApi.PUBLIC_API_KEY_VALUE)
                    .addQueryParameter(MarvelCostantsApi.TS,MarvelCostantsApi.TS_VALUE)
                    .build();

            Request.Builder requestBuilder = defaultRequest.newBuilder().url(httpUrl);

            return chain.proceed(requestBuilder.build());
        }
    });

    private static Retrofit.Builder builder =
            new Retrofit.Builder()
                    .baseUrl(MarvelCostantsApi.BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create());

    public static <S> S createService(Class<S> serviceClass) {
        Retrofit retrofit = builder.client(httpClient.build()).build();
        return retrofit.create(serviceClass);
    }


}
