package com.soeasy.top.admin.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.extension.activerecord.Model;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 后台用户权限表
 * </p>
 *
 * @author lqh
 * @since 2019-10-12
 */
public class UmsPermission extends Model<UmsPermission> {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 父级权限id
     */
    private Long pid;

    /**
     * 名称
     */
    private String name;

    /**
     * 权限值
     */
    private String value;

    /**
     * 图标
     */
    private String icon;

    /**
     * 权限类型：0->目录；1->菜单；2->按钮（接口绑定权限）
     */
    private Integer type;

    /**
     * 前端资源路径
     */
    private String uri;

    /**
     * 启用状态；0->禁用；1->启用
     */
    private Integer status;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 排序
     */
    private Integer sort;


    public Long getId() {
        return id;
    }

    public UmsPermission setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getPid() {
        return pid;
    }

    public UmsPermission setPid(Long pid) {
        this.pid = pid;
        return this;
    }

    public String getName() {
        return name;
    }

    public UmsPermission setName(String name) {
        this.name = name;
        return this;
    }

    public String getValue() {
        return value;
    }

    public UmsPermission setValue(String value) {
        this.value = value;
        return this;
    }

    public String getIcon() {
        return icon;
    }

    public UmsPermission setIcon(String icon) {
        this.icon = icon;
        return this;
    }

    public Integer getType() {
        return type;
    }

    public UmsPermission setType(Integer type) {
        this.type = type;
        return this;
    }

    public String getUri() {
        return uri;
    }

    public UmsPermission setUri(String uri) {
        this.uri = uri;
        return this;
    }

    public Integer getStatus() {
        return status;
    }

    public UmsPermission setStatus(Integer status) {
        this.status = status;
        return this;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public UmsPermission setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
        return this;
    }

    public Integer getSort() {
        return sort;
    }

    public UmsPermission setSort(Integer sort) {
        this.sort = sort;
        return this;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "UmsPermission{" +
        "id=" + id +
        ", pid=" + pid +
        ", name=" + name +
        ", value=" + value +
        ", icon=" + icon +
        ", type=" + type +
        ", uri=" + uri +
        ", status=" + status +
        ", createTime=" + createTime +
        ", sort=" + sort +
        "}";
    }
}
