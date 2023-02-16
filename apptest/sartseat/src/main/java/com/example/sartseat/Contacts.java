package com.example.sartseat;

import java.io.Serializable;

/**
 * Created by CaseyZhou on 2022/11/29.
 */
// 1.抽象属性  2.抽象行为
public class Contacts implements Serializable {
    private int imageId;
    private String nickname;
    private String content;
//构造方法
    public Contacts(int imageId, String nickname, String content) {
//        给属性赋值
        this.imageId = imageId;
        this.nickname = nickname;
        this.content = content;
    }
//setXXX、getXXX方法
    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }
    //setXXX、getXXX方法
    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
    //setXXX、getXXX方法
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
