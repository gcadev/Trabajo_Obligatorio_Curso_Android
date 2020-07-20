package io;

import com.example.trabajoobligatoriocursoandroid.Negocios;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface NegociosApiService {
    void getNegocios();

    public interface MyApiService<LoginResponse> {


        @GET("login")
        Call<LoginResponse> getLogin(
                @Query("username") String username,
                @Query("password") String password
        );

        @FormUrlEncoded
        @POST("product")
        <SimpleResponse>
        Call<SimpleResponse> postNewProduct(
                @Field("code") String code,
                @Field("name") String name,
                @Field("description") String description
        );

    }
}
