package com.example.sartseat;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.Toast;

public class welcome extends Activity {
//当前进度值
    int mProgress=0;
    Handler handler;
    ProgressBar progressBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        progressBar=findViewById(R.id.progressbar);
        //    消息对象
        handler=new Handler(){
            @Override
            public void handleMessage(Message msg) {
                super.handleMessage(msg);
                if(msg.what==0x111){
                //设置进度完成的百分比
                    progressBar.setProgress(mProgress);
                }else if(msg.what==0x110){
                    //    进度条消失
                    progressBar.setVisibility(View.GONE);
                    Toast.makeText(welcome.this,"欢迎进入奇米星座!",Toast.LENGTH_SHORT).show();
//                启动其他Act
                    Intent intent=new Intent(welcome.this,login.class);
                    startActivity(intent);
                }
            }
        };
//        创建线程
        new Thread(new Runnable() {
            @Override
            public void run() {
//              模拟耗时操作
                while (true){
                    mProgress=dowork();
//                  发送消息
                    Message msg=new Message();
                    if(mProgress<100){
                        msg.what=0x111;
                        handler.sendMessage(msg);
                    }else //加载完成
                    {
                        msg.what=0x110;
                        handler.sendMessage(msg);
                        break;
                    }


                }

            }
        }).start();
    }

    //    模拟耗时工作
    public int dowork(){
        mProgress+=Math.random()*10;
        try {
//            睡眠
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
//        返回mProgress
        return mProgress;
    }
}

