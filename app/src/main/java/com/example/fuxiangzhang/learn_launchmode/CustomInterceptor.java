package com.example.fuxiangzhang.learn_launchmode;

import android.support.annotation.NonNull;

import java.io.IOException;
import java.lang.annotation.Inherited;

import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by Fuxiang.Zhang on 2016/11/4.
 */

public class CustomInterceptor implements Interceptor {
    @Override
    public Response intercept(Chain chain) throws IOException {
        Request request=chain.request();
        HttpUrl httpUrl=request.url().newBuilder()
                .addQueryParameter("token","tokenvalue")
                .build();
        request=request.newBuilder().url(httpUrl).build();
        return chain.proceed(request);
    }


    public @NonNull String
}
