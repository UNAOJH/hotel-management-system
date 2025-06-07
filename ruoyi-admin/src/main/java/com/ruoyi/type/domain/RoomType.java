package com.ruoyi.type.domain;

import java.math.BigDecimal;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 房型信息对象 room_type
 * 
 * @author unaojh
 * @date 2025-06-07
 */
public class RoomType extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 房型ID */
    private Long id;

    /** 房型名称 */
    @Excel(name = "房型名称")
    private String name;

    /** 描述 */
    @Excel(name = "描述")
    private String description;

    /** 参考价格 */
    @Excel(name = "参考价格")
    private BigDecimal price;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }

    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }

    public void setDescription(String description) 
    {
        this.description = description;
    }

    public String getDescription() 
    {
        return description;
    }

    public void setPrice(BigDecimal price) 
    {
        this.price = price;
    }

    public BigDecimal getPrice() 
    {
        return price;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("name", getName())
            .append("description", getDescription())
            .append("price", getPrice())
            .append("createTime", getCreateTime())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
