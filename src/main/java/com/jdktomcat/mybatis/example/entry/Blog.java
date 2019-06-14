package com.jdktomcat.mybatis.example.entry;

import java.io.Serializable;

/**
 * 类描述：博客信息类
 *
 * @author 汤旗
 * @date 2019-06-14 14:49
 */
public class Blog implements Serializable {
    /**
     * 序列化版本号
     */
    private static final long serialVersionUID = -7895080359534706395L;

    /**
     * 标识
     */
    private int id;

    /**
     * 名称
     */
    private String name;

    /**
     * 内容
     */
    private String content;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
