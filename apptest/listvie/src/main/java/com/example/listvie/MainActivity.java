package com.example.listvie;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Spinner spinner = findViewById(R.id.spinner);
        String []strings = new String[]{"全部","视频","音乐","图书"};
        // 适配器。参数：上下文对象；每一个下拉选项的样式；资源数组
        ArrayAdapter arrayAdapter = new ArrayAdapter(this,android.R.layout.simple_spinner_item,strings);
        // 下拉列表框绑定适配器对象
        spinner.setAdapter(arrayAdapter);


        ListView listView = findViewById(R.id.listview_contacts);
        // 创建联系人列表(链表)
        final List<Contacts> contactsList = new ArrayList<>();
        Contacts contacts1 = new Contacts(R.mipmap.ic_launcher,"张三丰","武当掌门人，太极创造者");
        contactsList.add(contacts1);
        Contacts contacts2 = new Contacts(R.mipmap.ic_launcher,"张无忌","明教教主");
        contactsList.add(contacts2);
        Contacts contacts3 = new Contacts(R.mipmap.ic_launcher,"周芷若","峨眉派掌门人");
        contactsList.add(contacts3);
        for (int i=0;i<50;i++)
        {
            Contacts contacts4 = new Contacts(R.mipmap.ic_launcher,"白眉鹰王","明教护法");
            contactsList.add(contacts4);
        }
        // 适配器
        ContactsAdapter contactsAdapter = new ContactsAdapter(this,R.layout.contacts_item,contactsList);
        // 绑定适配器
        listView.setAdapter(contactsAdapter);

        // 列表项点击监听器
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                // 通过下标i值获取联系人
                Contacts contacts = contactsList.get(i);
                Toast.makeText(MainActivity.this, ""+contacts.getNickname(), Toast.LENGTH_SHORT).show();

                // 启动详细信息页面  (意图：)快递员
                Intent intent = new Intent(MainActivity.this,activity_detail.class);
                // Bundle：包裹   键值对的集合 key value  key value  key value  key value
                Bundle bundle = new Bundle();
                // 添加对象
                bundle.putSerializable("contacts",contacts);
//                // 添加头像
//                bundle.putInt("imgId",contacts.getImageId());
//                // 添加昵称
//                bundle.putString("nickname",contacts.getNickname());
//                // 添加描述
//                bundle.putString("content",contacts.getContent());
                // 绑定到intent
                intent.putExtras(bundle);
                startActivity(intent);

            }
        });
    }
}
