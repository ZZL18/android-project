package com.example.sartseat;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by CaseyZhou on 2022/11/29.
 */
//继承ArrayAdapter类
public class ContactsAdapter extends ArrayAdapter<Contacts>
{
//调用适配器ContactsAdapte方法
    public ContactsAdapter(@NonNull Context context, int resource, @NonNull List<Contacts> objects) {
        super(context, resource, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // 通过下标获取到联系人对象
        Contacts contacts = getItem(position);
        // 创建一个视图
        View view = LayoutInflater.from(getContext()).inflate(R.layout.contacts_item,parent,false);
//        获取id
        ImageView header = view.findViewById(R.id.header);
//        获取名字id
        TextView nickname = view.findViewById(R.id.nickname);
//        获取内容id
        TextView content = view.findViewById(R.id.content);
//        设置图像
        header.setImageResource(contacts.getImageId());
//        设置名字
        nickname.setText(contacts.getNickname());
//        设置内容
        content.setText(contacts.getContent());
//        返回视图
        return view;
    }
}
