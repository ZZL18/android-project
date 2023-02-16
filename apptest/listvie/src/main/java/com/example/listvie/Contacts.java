package com.example.listvie;

import java.io.Serializable;

/**
 * Created by CaseyZhou on 2022/11/29.
 */
// 1.抽象属性  2.抽象行为
public class Contacts implements Serializable {
    private int imageId;
    private String nickname;
    private String content;

    public Contacts(int imageId, String nickname, String content) {
        this.imageId = imageId;
        this.nickname = nickname;
        this.content = content;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
