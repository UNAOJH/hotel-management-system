package com.ruoyi.carousel.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 轮播图管理对象 carousel
 * 
 * @author ruoyi
 * @date 2025-06-07
 */
public class Carousel extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 轮播图ID */
    private Long id;

    /** 图片地址 */
    @Excel(name = "图片地址")
    private String imageUrl;

    /** 跳转链接 */
    @Excel(name = "跳转链接")
    private String linkUrl;

    /** 排序 */
    @Excel(name = "排序")
    private Long sortOrder;

    /** 状态，0禁用，1启用 */
    @Excel(name = "状态，0禁用，1启用")
    private Long status;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }

    public void setImageUrl(String imageUrl) 
    {
        this.imageUrl = imageUrl;
    }

    public String getImageUrl() 
    {
        return imageUrl;
    }

    public void setLinkUrl(String linkUrl) 
    {
        this.linkUrl = linkUrl;
    }

    public String getLinkUrl() 
    {
        return linkUrl;
    }

    public void setSortOrder(Long sortOrder) 
    {
        this.sortOrder = sortOrder;
    }

    public Long getSortOrder() 
    {
        return sortOrder;
    }

    public void setStatus(Long status) 
    {
        this.status = status;
    }

    public Long getStatus() 
    {
        return status;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("imageUrl", getImageUrl())
            .append("linkUrl", getLinkUrl())
            .append("sortOrder", getSortOrder())
            .append("status", getStatus())
            .append("createTime", getCreateTime())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
