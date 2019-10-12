package com.soeasy.top.admin.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.extension.activerecord.Model;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 后台用户表
 * </p>
 *
 * @author lqh
 * @since 2019-10-12
 */
public class UmsAdmin extends Model<UmsAdmin> {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @TableField(value = "username")
    private String username;
    @TableField(value = "password")
    private String password;

    /**
     * 头像
     */
    @TableField(value = "password")
    private String icon;

    /**
     * 邮箱
     */
    @TableField(value = "password")
    private String email;

    /**
     * 昵称
     */
    @TableField(value = "password")
    private String nickName;

    /**
     * 备注信息
     */
    @TableField(value = "password")
    private String note;

    /**
     * 创建时间
     */
    @TableField(value = "password")
    private Date createTime;

    /**
     * 最后登录时间
     */
    @TableField(value = "password")
    private Date loginTime;

    /**
     * 帐号启用状态：0->禁用；1->启用
     */
    @TableField(value = "password")
    private Integer status;


    public Long getId() {
        return id;
    }

    public UmsAdmin setId(Long id) {
        this.id = id;
        return this;
    }

    public String getUsername() {
        return username;
    }

    public UmsAdmin setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public UmsAdmin setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getIcon() {
        return icon;
    }

    public UmsAdmin setIcon(String icon) {
        this.icon = icon;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public UmsAdmin setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getNickName() {
        return nickName;
    }

    public UmsAdmin setNickName(String nickName) {
        this.nickName = nickName;
        return this;
    }

    public String getNote() {
        return note;
    }

    public UmsAdmin setNote(String note) {
        this.note = note;
        return this;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public UmsAdmin setCreateTime(Date createTime) {
        this.createTime = createTime;
        return this;
    }

    public Date getLoginTime() {
        return loginTime;
    }

    public UmsAdmin setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
        return this;
    }

    public Integer getStatus() {
        return status;
    }

    public UmsAdmin setStatus(Integer status) {
        this.status = status;
        return this;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "UmsAdmin{" +
        "id=" + id +
        ", username=" + username +
        ", password=" + password +
        ", icon=" + icon +
        ", email=" + email +
        ", nickName=" + nickName +
        ", note=" + note +
        ", createTime=" + createTime +
        ", loginTime=" + loginTime +
        ", status=" + status +
        "}";
    }
}
