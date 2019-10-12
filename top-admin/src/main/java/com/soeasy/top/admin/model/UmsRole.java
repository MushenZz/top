package com.soeasy.top.admin.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.extension.activerecord.Model;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 后台用户角色表
 * </p>
 *
 * @author lqh
 * @since 2019-10-12
 */
public class UmsRole extends Model<UmsRole> {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 名称
     */
    private String name;

    /**
     * 描述
     */
    private String description;

    /**
     * 后台用户数量
     */
    private Integer adminCount;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 启用状态：0->禁用；1->启用
     */
    private Integer status;

    private Integer sort;


    public Long getId() {
        return id;
    }

    public UmsRole setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public UmsRole setName(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public UmsRole setDescription(String description) {
        this.description = description;
        return this;
    }

    public Integer getAdminCount() {
        return adminCount;
    }

    public UmsRole setAdminCount(Integer adminCount) {
        this.adminCount = adminCount;
        return this;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public UmsRole setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
        return this;
    }

    public Integer getStatus() {
        return status;
    }

    public UmsRole setStatus(Integer status) {
        this.status = status;
        return this;
    }

    public Integer getSort() {
        return sort;
    }

    public UmsRole setSort(Integer sort) {
        this.sort = sort;
        return this;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "UmsRole{" +
        "id=" + id +
        ", name=" + name +
        ", description=" + description +
        ", adminCount=" + adminCount +
        ", createTime=" + createTime +
        ", status=" + status +
        ", sort=" + sort +
        "}";
    }
}
