package com.example.a31290.androidproject;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class StartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        initview();

    }
    private void initview( ) {
        SharedPreferences sp=getSharedPreferences( "name",MODE_PRIVATE);boolean is=sp.getBoolean( "ok " ,true);
        boolean i=sp.getBoolean("ok",true);
        if(i){
            SharedPreferences.Editor editor=sp.edit( );editor.putBoolean( "ok " ,false);
            editor.apply();
            startActivity(new Intent(StartActivity.this,Introduttory.class));
            finish();
        }else {
            //直接进入首页
            startActivity( new Intent(StartActivity.this,MainActivity.class));
            finish( );
        }
    }


}
