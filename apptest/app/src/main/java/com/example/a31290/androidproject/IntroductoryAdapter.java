package com.example.a31290.androidproject;

import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by 31290 on 2022/12/9.
 */

public class IntroductoryAdapter extends PagerAdapter {
    private List<View> list;
    public IntroductoryAdapter(List<View> list) {
        this.list=list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
       View view=list.get(position);
       container.addView(view);
       return view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView(list.get(position));
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view==object;
    }
}
