package com.ruoyi.reservation.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 预定信息对象 biz_reservation
 * 
 * @author ruoyi
 * @date 2025-06-08
 */
public class Reservation extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long id;

    /** 房间ID */
    @Excel(name = "房间ID")
    private Long roomId;

    /** 预订日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "预订日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date reserveDate;

    /** 预定天数 */
    @Excel(name = "预定天数")
    private String reserveTime;

    /** 是否预订（Y已预订/N未预订） */
    private String reserved;

    /** 预订人姓名 */
    @Excel(name = "预订人姓名")
    private String reserverName;

    /** 预订人电话 */
    @Excel(name = "预订人电话")
    private String reserverPhone;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }

    public void setRoomId(Long roomId) 
    {
        this.roomId = roomId;
    }

    public Long getRoomId() 
    {
        return roomId;
    }

    public void setReserveDate(Date reserveDate) 
    {
        this.reserveDate = reserveDate;
    }

    public Date getReserveDate() 
    {
        return reserveDate;
    }

    public void setReserveTime(String reserveTime) 
    {
        this.reserveTime = reserveTime;
    }

    public String getReserveTime() 
    {
        return reserveTime;
    }

    public void setReserved(String reserved) 
    {
        this.reserved = reserved;
    }

    public String getReserved() 
    {
        return reserved;
    }

    public void setReserverName(String reserverName) 
    {
        this.reserverName = reserverName;
    }

    public String getReserverName() 
    {
        return reserverName;
    }

    public void setReserverPhone(String reserverPhone) 
    {
        this.reserverPhone = reserverPhone;
    }

    public String getReserverPhone() 
    {
        return reserverPhone;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("roomId", getRoomId())
            .append("reserveDate", getReserveDate())
            .append("reserveTime", getReserveTime())
            .append("reserved", getReserved())
            .append("reserverName", getReserverName())
            .append("reserverPhone", getReserverPhone())
            .append("remark", getRemark())
            .append("createTime", getCreateTime())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
