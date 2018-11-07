package com.firminli.pojo;

import javax.persistence.Column;
import javax.persistence.Id;

public class Users {
    /**
     * 主键id
     */
    @Id
    private String id;

    /**
     * 用户名
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    /**
     * 头像地址
     */
    @Column(name = "face_image")
    private String faceImage;

    /**
     * 昵称
     */
    private String nickname;

    /**
     * 粉丝数量
     */
    @Column(name = "fans_counts")
    private Integer fansCounts;

    /**
     * 关注数量
     */
    @Column(name = "follow_counts")
    private Integer followCounts;

    /**
     * 获赞数量
     */
    @Column(name = "receive_like_counts")
    private Integer receiveLikeCounts;

    /**
     * 获取主键id
     *
     * @return id - 主键id
     */
    public String getId() {
        return id;
    }

    /**
     * 设置主键id
     *
     * @param id 主键id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取用户名
     *
     * @return username - 用户名
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置用户名
     *
     * @param username 用户名
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 获取密码
     *
     * @return password - 密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置密码
     *
     * @param password 密码
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取头像地址
     *
     * @return face_image - 头像地址
     */
    public String getFaceImage() {
        return faceImage;
    }

    /**
     * 设置头像地址
     *
     * @param faceImage 头像地址
     */
    public void setFaceImage(String faceImage) {
        this.faceImage = faceImage;
    }

    /**
     * 获取昵称
     *
     * @return nickname - 昵称
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * 设置昵称
     *
     * @param nickname 昵称
     */
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    /**
     * 获取粉丝数量
     *
     * @return fans_counts - 粉丝数量
     */
    public Integer getFansCounts() {
        return fansCounts;
    }

    /**
     * 设置粉丝数量
     *
     * @param fansCounts 粉丝数量
     */
    public void setFansCounts(Integer fansCounts) {
        this.fansCounts = fansCounts;
    }

    /**
     * 获取关注数量
     *
     * @return follow_counts - 关注数量
     */
    public Integer getFollowCounts() {
        return followCounts;
    }

    /**
     * 设置关注数量
     *
     * @param followCounts 关注数量
     */
    public void setFollowCounts(Integer followCounts) {
        this.followCounts = followCounts;
    }

    /**
     * 获取获赞数量
     *
     * @return receive_like_counts - 获赞数量
     */
    public Integer getReceiveLikeCounts() {
        return receiveLikeCounts;
    }

    /**
     * 设置获赞数量
     *
     * @param receiveLikeCounts 获赞数量
     */
    public void setReceiveLikeCounts(Integer receiveLikeCounts) {
        this.receiveLikeCounts = receiveLikeCounts;
    }
}