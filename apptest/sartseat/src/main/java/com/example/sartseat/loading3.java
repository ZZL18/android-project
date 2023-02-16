package com.example.sartseat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class loading3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loading3);

//开启一个子线程
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
//等待3s
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
//启动第二个页面
                Intent it = new Intent(getApplicationContext(),
                        MainActivity.class);
                startActivity(it);
            }
        });
        t.start();
    }
}
