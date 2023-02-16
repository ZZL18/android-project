package com.example.sartseat;

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

public class YunShi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yun_shi);
        Spinner spinner = findViewById(R.id.spinner);
//        数组对象
        String []strings = new String[]{"2022年运势","2021年运势","2020年运势","2019年运势"};
        // 适配器。参数：上下文对象；每一个下拉选项的样式；资源数组
        ArrayAdapter arrayAdapter = new ArrayAdapter(this,android.R.layout.simple_spinner_item,strings);
        // 下拉列表框绑定适配器对象
        spinner.setAdapter(arrayAdapter);
        ListView listView = findViewById(R.id.listview_contacts);
        // 创建联系人列表(链表)
        final List<Contacts> contactsList = new ArrayList<>();
        Contacts contacts1 = new Contacts(R.mipmap.baiyang,"白羊座2022年运势","最近可能会想一个人待着，冷静去思考什么东西的感觉，也要注意不要丢东西，感觉今天可能会找什么东西，会有什么新的转机或者机会出现，也可能会听到什么重要的好消息。");
        contactsList.add(contacts1);
        Contacts contacts2 = new Contacts(R.mipmap.jinniu,"金牛座2022年运势","最近可能会觉得有些痛苦，注意身体健康，同时会容易emo，到了晚上可能就会想很多，可能会脑补出很多事情，实际上都没有发生。");
        contactsList.add(contacts2);
        Contacts contacts3 = new Contacts(R.mipmap.shuangzi,"双子座2022年运势","最近要注意口舌之争，可能会和谁吵架，不过好在这种冲突是可以避免的，注意调整自己的心态。或者会有-些新的思路和想法，今天可以相信自己的第六感喔。");
        contactsList.add(contacts3);
        Contacts contacts4 = new Contacts(R.mipmap.jvxie,"巨蟹座2022年运势","最近要注意- -下情绪方面的问题，可能会有些喜怒无常，也很容易被激怒。");
        contactsList.add(contacts4);
        Contacts contacts5 = new Contacts(R.mipmap.shizi,"狮子座2022年运势","最近可能会去收集什么信息，或者会有-些新的思路和想法，今天可以相信自己的第六感喔。注意身体健康，同时会容易emo，到了晚上可能就会想很多。");
        contactsList.add(contacts5);
        Contacts contacts6 = new Contacts(R.mipmap.chunv,"处女座2022年运势","最近可能会有些固执己见，做事方面也有些不负责任，注意力也不够集中，很容易觉得累。可能会有什么新的转机或者机会出现，也可能会听到什么重要的好消息，要抓住机会!");
        contactsList.add(contacts6);
        Contacts contacts7 = new Contacts(R.mipmap.tianping,"天秤座2022年运势","最近可能会容易出现分配不均的情况，或者你可能会觉得某个人有些偏心，导致你受到不公平的待遇。");
        contactsList.add(contacts7);
        Contacts contacts8 = new Contacts(R.mipmap.tianxie,"天蝎座2022年运势","最近可能会有一些不太现实或者是做事方面也有些不负责任，注意力也不够集中，很容易觉得累。可能会有些喜怒无常，也很容易被激怒。");
        contactsList.add(contacts8);
        Contacts contacts9 = new Contacts(R.mipmap.sheshou,"射手座2022年运势","最近可能会有些固执己见，做事方面也有些不负责任，注意力也不够集中，很容易觉得累。");
        contactsList.add(contacts9);
        Contacts contacts10 = new Contacts(R.mipmap.mojie,"摩羯座2022年运势","最近可能会有一些不太现实或者是不真实的想法，可能会脑补出很多事情，实际上都没有发生。");
        contactsList.add(contacts10);
        Contacts contacts11 = new Contacts(R.mipmap.shuangyv,"双鱼座2022年运势","最近适合去社交，还蛮受欢迎的,可能是你在很多人面前做了什么事，然后大家觉得你很厉害。做事方面也有些不负责任，注意力也不够集中，很容易觉得累。");
        contactsList.add(contacts11);
        Contacts contacts12 = new Contacts(R.mipmap.shuiping,"水瓶座2022年运势","最近还不错，可能会有什么新的转机或者机会出现，也可能会听到什么重要的好消息，要抓住机会!");
        contactsList.add(contacts12);
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
                Toast.makeText(YunShi.this, ""+contacts.getNickname(), Toast.LENGTH_SHORT).show();

                // 启动详细信息页面  (意图：)快递员
                Intent intent = new Intent(YunShi.this,DetailActivity.class);
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
//                启动Activity
                startActivity(intent);

            }
        });
    }
}
