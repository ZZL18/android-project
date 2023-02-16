package com.example.sartseat;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/**
 * Created by 31290 on 2022/12/9.
 */
//继承Fragment类
public class Constell_fragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
//调用inflate方法加载布局文件 填充视图
        View view=inflater.inflate(R.layout.constell_fragment,container, false);
//        返回视图
        return view;
    }
    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
//        获取星座id
        ImageView iv1 = getActivity().findViewById(R.id.baiyang);
//        添加监听事件，点击跳转星座信息类
        iv1.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), sartInformation.class));
            }
        });
        //        获取星座id
        ImageView iv2 = getActivity().findViewById(R.id.sheshou);
//        添加监听事件，点击跳转星座信息类
        iv2.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), sartInformation.class));
            }
        });
        //        获取星座id
        ImageView iv3 = getActivity().findViewById(R.id.shuangzi);
//        添加监听事件，点击跳转星座信息类
        iv3.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), sartInformation.class));
            }
        });
    }
}
