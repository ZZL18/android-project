package com.example.sartseat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
//登录类
public class login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        启动activity_login
        setContentView(R.layout.activity_login);
//        获取用户名id
        final EditText et_user=findViewById(R.id.et_name);
//        获取密码id
        final EditText et_password=findViewById(R.id.et_password);
        Button btn_login=findViewById(R.id.btn_login);
        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                获取用户名和密码
                String str_user=et_user.getText().toString();
                String str_password=et_password.getText().toString();
                if(str_user.equals("admin")&&str_password.equals("123456")){
                    Toast.makeText(login.this,"账号密码匹配成功",Toast.LENGTH_SHORT).show();
//                    启动BMI界面
                    Intent intent=new Intent(login.this,MainActivity.class);
                    startActivity(intent);
                    return;
                }
//                判断用户名是否为空
                if(str_user.equals("")){
                    Toast.makeText(login.this,"请输入用户名！！！",Toast.LENGTH_SHORT).show();
                }else if(!str_user.equals("admin")){
                    Toast.makeText(login.this,"请输入正确的用户名！！！",Toast.LENGTH_SHORT).show();
                }
            }
        });
//        获取注册文本id
        TextView reg=findViewById(R.id.reg);
        reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                    启动BMI界面
                Intent intent=new Intent(login.this,loading2.class);
                startActivity(intent);
                return;

            }
        });
    }
}
