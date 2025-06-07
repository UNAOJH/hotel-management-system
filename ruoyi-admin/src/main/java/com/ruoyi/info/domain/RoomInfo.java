package com.ruoyi.info.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 客房信息对象 room_info
 * 
 * @author ruoyi
 * @date 2025-06-07
 */
public class RoomInfo extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 房间ID */
    private Long id;

    /** 房间编号 */
    @Excel(name = "房间编号")
    private String roomNumber;

    /** 所属房型ID */
    @Excel(name = "所属房型ID")
    private Long roomTypeId;

    /** 房间状态（0空闲 1已预订 2入住中 3维修中） */
    @Excel(name = "房间状态", readConverterExp = "0=空闲,1=已预订,2=入住中,3=维修中")
    private Long status;

    /** 楼层 */
    @Excel(name = "楼层")
    private Long floor;

    /** 房间描述 */
    @Excel(name = "房间描述")
    private String description;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }

    public void setRoomNumber(String roomNumber) 
    {
        this.roomNumber = roomNumber;
    }

    public String getRoomNumber() 
    {
        return roomNumber;
    }

    public void setRoomTypeId(Long roomTypeId) 
    {
        this.roomTypeId = roomTypeId;
    }

    public Long getRoomTypeId() 
    {
        return roomTypeId;
    }

    public void setStatus(Long status) 
    {
        this.status = status;
    }

    public Long getStatus() 
    {
        return status;
    }

    public void setFloor(Long floor) 
    {
        this.floor = floor;
    }

    public Long getFloor() 
    {
        return floor;
    }

    public void setDescription(String description) 
    {
        this.description = description;
    }

    public String getDescription() 
    {
        return description;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("roomNumber", getRoomNumber())
            .append("roomTypeId", getRoomTypeId())
            .append("status", getStatus())
            .append("floor", getFloor())
            .append("description", getDescription())
            .append("createTime", getCreateTime())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
