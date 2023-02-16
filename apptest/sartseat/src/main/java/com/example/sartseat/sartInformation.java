package com.example.sartseat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
//星座详情类
public class sartInformation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sart_information);
//        点击按钮返回
        ImageView bc = findViewById(R.id.back);
//        绑定点击事件
        bc.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                sartInformation.this.finish();
            }
        });
    }

}
