package com.soeasy.top.admin.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.extension.activerecord.Model;

import java.io.Serializable;

/**
 * <p>
 * 后台用户和权限关系表(除角色中定义的权限以外的加减权限)
 * </p>
 *
 * @author lqh
 * @since 2019-10-12
 */
public class UmsAdminPermissionRelation extends Model<UmsAdminPermissionRelation> {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private Long adminId;

    private Long permissionId;

    private Integer type;


    public Long getId() {
        return id;
    }

    public UmsAdminPermissionRelation setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getAdminId() {
        return adminId;
    }

    public UmsAdminPermissionRelation setAdminId(Long adminId) {
        this.adminId = adminId;
        return this;
    }

    public Long getPermissionId() {
        return permissionId;
    }

    public UmsAdminPermissionRelation setPermissionId(Long permissionId) {
        this.permissionId = permissionId;
        return this;
    }

    public Integer getType() {
        return type;
    }

    public UmsAdminPermissionRelation setType(Integer type) {
        this.type = type;
        return this;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "UmsAdminPermissionRelation{" +
        "id=" + id +
        ", adminId=" + adminId +
        ", permissionId=" + permissionId +
        ", type=" + type +
        "}";
    }
}
