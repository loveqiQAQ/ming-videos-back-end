package com.firminli.pojo;

import javax.persistence.Id;

public class Bgm {
    @Id
    private String id;

    /**
     * 背景音乐作者
     */
    private String author;

    /**
     * 背景音乐名称
     */
    private String name;

    /**
     * 背景音乐地址
     */
    private String path;

    /**
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取背景音乐作者
     *
     * @return author - 背景音乐作者
     */
    public String getAuthor() {
        return author;
    }

    /**
     * 设置背景音乐作者
     *
     * @param author 背景音乐作者
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * 获取背景音乐名称
     *
     * @return name - 背景音乐名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置背景音乐名称
     *
     * @param name 背景音乐名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取背景音乐地址
     *
     * @return path - 背景音乐地址
     */
    public String getPath() {
        return path;
    }

    /**
     * 设置背景音乐地址
     *
     * @param path 背景音乐地址
     */
    public void setPath(String path) {
        this.path = path;
    }
}