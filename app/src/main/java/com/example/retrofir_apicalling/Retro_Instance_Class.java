package com.example.retrofir_apicalling;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Retro_Instance_Class
{
    public static  API_Interface  CallApi()
    {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://bhavadipecommerce.000webhostapp.com/ECommerceApp/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        API_Interface api_interface = retrofit.create(API_Interface.class);
        return  api_interface;
    }
}
