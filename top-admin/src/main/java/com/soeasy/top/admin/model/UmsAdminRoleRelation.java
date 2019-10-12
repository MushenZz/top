package com.soeasy.top.admin.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.extension.activerecord.Model;

import java.io.Serializable;

/**
 * <p>
 * 后台用户和角色关系表
 * </p>
 *
 * @author lqh
 * @since 2019-10-12
 */
public class UmsAdminRoleRelation extends Model<UmsAdminRoleRelation> {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private Long adminId;

    private Long roleId;


    public Long getId() {
        return id;
    }

    public UmsAdminRoleRelation setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getAdminId() {
        return adminId;
    }

    public UmsAdminRoleRelation setAdminId(Long adminId) {
        this.adminId = adminId;
        return this;
    }

    public Long getRoleId() {
        return roleId;
    }

    public UmsAdminRoleRelation setRoleId(Long roleId) {
        this.roleId = roleId;
        return this;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "UmsAdminRoleRelation{" +
        "id=" + id +
        ", adminId=" + adminId +
        ", roleId=" + roleId +
        "}";
    }
}
