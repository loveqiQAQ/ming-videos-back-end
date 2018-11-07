package com.firminli.pojo;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "users_report")
public class UsersReport {
    @Id
    private String id;

    /**
     * 需要被处理的用户id
     */
    @Column(name = "deal_user_id")
    private String dealUserId;

    /**
     * 需要被处理的视频的id
     */
    @Column(name = "deal_video_id")
    private String dealVideoId;

    /**
     * 举报标题
     */
    private String title;

    /**
     * 举报内容
     */
    private String content;

    /**
     * 举报者id
     */
    private String userid;

    /**
     * 举报时间
     */
    @Column(name = "create_time")
    private Date createTime;

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
     * 获取需要被处理的用户id
     *
     * @return deal_user_id - 需要被处理的用户id
     */
    public String getDealUserId() {
        return dealUserId;
    }

    /**
     * 设置需要被处理的用户id
     *
     * @param dealUserId 需要被处理的用户id
     */
    public void setDealUserId(String dealUserId) {
        this.dealUserId = dealUserId;
    }

    /**
     * 获取需要被处理的视频的id
     *
     * @return deal_video_id - 需要被处理的视频的id
     */
    public String getDealVideoId() {
        return dealVideoId;
    }

    /**
     * 设置需要被处理的视频的id
     *
     * @param dealVideoId 需要被处理的视频的id
     */
    public void setDealVideoId(String dealVideoId) {
        this.dealVideoId = dealVideoId;
    }

    /**
     * 获取举报标题
     *
     * @return title - 举报标题
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置举报标题
     *
     * @param title 举报标题
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 获取举报内容
     *
     * @return content - 举报内容
     */
    public String getContent() {
        return content;
    }

    /**
     * 设置举报内容
     *
     * @param content 举报内容
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * 获取举报者id
     *
     * @return userid - 举报者id
     */
    public String getUserid() {
        return userid;
    }

    /**
     * 设置举报者id
     *
     * @param userid 举报者id
     */
    public void setUserid(String userid) {
        this.userid = userid;
    }

    /**
     * 获取举报时间
     *
     * @return create_time - 举报时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置举报时间
     *
     * @param createTime 举报时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}