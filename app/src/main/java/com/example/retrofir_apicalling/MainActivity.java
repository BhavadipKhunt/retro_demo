package com.example.retrofir_apicalling;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Retro_Instance_Class.CallApi().RegisterUser("Pradip","Pradip@gmail.com","123")
                .enqueue(new Callback<RegisterUser>() {
            @Override
            public void onResponse(Call<RegisterUser> call, Response<RegisterUser> response) {
                Log.d("TTT", "onResponse: Response="+response.body().toString());
                    if(response.body().getConnection()==1)
                    {
                        if(response.body().getResult()==1)
                        {
                            Toast.makeText(MainActivity.this, "Successfully Registered", Toast.LENGTH_LONG).show();
                        }
                        else if(response.body().getResult()==2)
                        {
                            Toast.makeText(MainActivity.this, "Already Registered", Toast.LENGTH_LONG).show();
                        }
                        else {
                            Toast.makeText(MainActivity.this, "User not Registered", Toast.LENGTH_LONG).show();
                        }
                    }
                    else
                    {
                        Toast.makeText(MainActivity.this, "Something went Wrong", Toast.LENGTH_LONG).show();
                    }

                 }

            @Override
            public void onFailure(Call<RegisterUser> call, Throwable t) {
                Log.e("TTT", "onResponse: Response="+t.getLocalizedMessage());
            }
        });

    }
}