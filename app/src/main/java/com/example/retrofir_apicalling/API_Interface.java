package com.example.retrofir_apicalling;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface API_Interface
{
    @FormUrlEncoded
    @POST("register.php")
    Call<RegisterUser> RegisterUser(@Field("name") String name, @Field("email") String email,@Field("password") String password);

}
