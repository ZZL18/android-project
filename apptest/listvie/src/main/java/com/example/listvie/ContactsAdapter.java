package com.example.listvie;

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

public class ContactsAdapter extends ArrayAdapter<Contacts>
{

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
        ImageView header = view.findViewById(R.id.header);
        TextView nickname = view.findViewById(R.id.nickname);
        TextView content = view.findViewById(R.id.content);
        header.setImageResource(contacts.getImageId());
        nickname.setText(contacts.getNickname());
        content.setText(contacts.getContent());
        return view;
    }
}
