package br.com.cran.uploaddearquivos;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class AppConfig {
    private static String BASE_URL = "https://linuxjf.com/ava/api/upload.php";
    static Retrofit getRetrofit(){
        return  new Retrofit.Builder().baseUrl(AppConfig.BASE_URL).addConverterFactory(GsonConverterFactory.create()).build();
    }
}
