package com.example.sartseat;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        // 获取上下文对象中的意图对象
        Intent intent = getIntent();
        // 获取“快递员”手中的“包裹”对象
        Bundle bundle = intent.getExtras();
        if(bundle != null)
        {
            Contacts contacts = (Contacts) bundle.getSerializable("contacts");
            // 获取星座信息
            int imgId = contacts.getImageId();//bundle.getInt("imgId");
            String nickname = contacts.getNickname();//bundle.getString("nickname");
            String content = contacts.getContent();//bundle.getString("content");

            // 获取组件
            ImageView iv_header = findViewById(R.id.imgId);
            TextView tv_nickname = findViewById(R.id.nickname);
            TextView tv_content = findViewById(R.id.content);

            // 修改组件信息
            iv_header.setImageResource(imgId);
            tv_nickname.setText(nickname);
            tv_content.setText(content);
        }



    }
}
