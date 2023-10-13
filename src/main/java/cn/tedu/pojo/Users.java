package cn.tedu.pojo;

import java.util.Date;
import java.io.Serializable;

/**
 * (TbUsers)实体类
 *
 * @author makejava
 * @since 2023-10-13 13:00:15
 */
public class Users implements Serializable {
    private static final long serialVersionUID = -17712036763722235L;

    private Integer id;
/**
     * 用户名
     */
    private String username;
/**
     * 昵称
     */
    private String nickname;
/**
     * 密码
     */
    private String password;
/**
     * 电话号码
     */
    private String mobile;
/**
     * 账号是否被锁住，0-》禁用，1-》启用
     */
    private Integer status;
/**
     * 注册时间
     */
    private Date createdTime;
/**
     * 注册时间
     */
    private Date modifiedTime;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public Date getModifiedTime() {
        return modifiedTime;
    }

    @Override
    public String toString() {
        return "Users{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", nickname='" + nickname + '\'' +
                ", password='" + password + '\'' +
                ", mobile='" + mobile + '\'' +
                ", status=" + status +
                ", createdTime=" + createdTime +
                ", modifiedTime=" + modifiedTime +
                '}';
    }

    public void setModifiedTime(Date modifiedTime) {
        this.modifiedTime = modifiedTime;
    }

}

