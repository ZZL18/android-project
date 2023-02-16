package com.example.sartseat;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends Activity {
    ImageView imageView1, imageView2, imageView3, imageView4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //  获取imageView组件的id号
        imageView1 = (ImageView) findViewById(R.id.img1);
        imageView2 = (ImageView) findViewById(R.id.img2);
        imageView3 = (ImageView) findViewById(R.id.img3);
        imageView4 = (ImageView) findViewById(R.id.img4);
//        绑定单击事件l
        imageView1.setOnClickListener(l);
        imageView2.setOnClickListener(l);
        imageView3.setOnClickListener(l);
        imageView4.setOnClickListener(l);
    }

    View.OnClickListener l = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            //更改图片路径
            imageView1.setImageResource(R.drawable.ib_luck_normal);
            imageView2.setImageResource(R.drawable.ib_star_normal);
            imageView3.setImageResource(R.drawable.ib_partner_normal);
            imageView4.setImageResource(R.drawable.ib_me_normal);
//获取所在Fragment 的父容器的管理器
            FragmentManager fm = getFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            Fragment f = null;
            switch (view.getId()) {
                case R.id.img1:
//                    更改图像路径
                    imageView1.setImageResource(R.drawable.ib_luck_focus);
//                    创建Sart_Fragment对象
                    f = new Constell_fragment();
                    break;
                case R.id.img2:
                    imageView2.setImageResource(R.drawable.ib_star_focus);
                    // 创建Constell_fragment对象
                    f = new Pair_Fragment();

                    break;
                case R.id.img3:
                    imageView3.setImageResource(R.drawable.ib_partner_focus);
//                    创建Pair_Fragment对象
                    f = new Sart_Fragment();
                    break;
                case R.id.img4:
                    imageView4.setImageResource(R.drawable.ib_me_focus);
//                    创建Me_Fragment对象
                    f = new Me_Fragment();
                    break;
                default:
                    break;
            }
            //替换新的fragment
            ft.replace(R.id.fragment, f);
            // 提交
            ft.commit();
        }
    };
}