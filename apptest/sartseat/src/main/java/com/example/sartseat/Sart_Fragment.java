package com.example.sartseat;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/**
 * Created by 31290 on 2022/12/9.
 */
//继承Fragment类
public class Sart_Fragment extends Fragment{


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        //调用inflate方法加载布局文件 填充视图
        View view=inflater.inflate(R.layout.star_fragment,container, false);
//        返回视图
        return view;
    }

}
