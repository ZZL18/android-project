package com.example.a31290.androidproject;

import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class Introduttory extends AppCompatActivity {
    private ViewPager mViewPage;
    private Button mButton;
    private List<View> viewList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_introduttory);

    }
//
//            设置第4个引导页的textView文本的点击事件
//
    private void initstart() {
    mButton=viewList.get( 3 ).findViewById(R.id.btn_open);
    mButton.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            startActivity(new Intent(Introduttory.this ,MainActivity.class));
            Introduttory.this.finish();
        }
    });
}
//适配器
    private void initAdapter() {
        IntroductoryAdapter adapter=new IntroductoryAdapter( viewList);
    mViewPage.setAdapter(adapter);
    }
//viewPager和4个引导
    private void initView( ) {
        mViewPage=findViewById( R.id.introduttory_viewPager);
        viewList=new ArrayList<>();
        viewList.add(getView(R.layout.introduttory_a)) ;
        viewList.add(getView(R.layout.introduttory_b)) ;
        viewList.add(getView(R.layout.introduttory_c)) ;

    }
    private View getView(int resId) {
        return LayoutInflater.from(this ).inflate( resId,null);
    }



}
