package com.example.sartseat;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

/**
 * Created by 31290 on 2022/12/9.
 */
//继承Fragment类
public class Pair_Fragment extends Fragment{
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        //调用inflate方法加载布局文件 填充视图
        View view=inflater.inflate(R.layout.pair_fragment,container, false);
//        返回视图
        return view;
    }
    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
//        获取按钮组件id
        Button button1 = getActivity().findViewById(R.id.but_test);
        Button button2 = getActivity().findViewById(R.id.jrys);
        Button button3=getActivity().findViewById(R.id.xzgs);
//        绑定单击事件
        button1.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
//                启动其他Activity
                startActivity(new Intent(getActivity(), Start_Test.class));
            }
        });
//         绑定单击事件
        button2.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                //                启动其他Activity
                startActivity(new Intent(getActivity(), YunShi.class));
            }
        });
//        绑定单击事件
        button3.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                //                启动其他Activity
                startActivity(new Intent(getActivity(), SartStory.class));
            }
        });
    }
}
