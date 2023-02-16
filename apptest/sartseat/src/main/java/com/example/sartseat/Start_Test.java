package com.example.sartseat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
//星座测试类
public class Start_Test extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.start__test);
//        获取按钮组件id
        Button button=findViewById(R.id.btn_submit);
//        绑定点击事件
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                显示吐司
                Toast.makeText(Start_Test.this,"提交成功",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
