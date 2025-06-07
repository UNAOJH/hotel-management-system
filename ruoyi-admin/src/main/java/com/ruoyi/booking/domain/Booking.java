package com.ruoyi.booking.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 预订信息对象 booking
 * 
 * @author ruoyi
 * @date 2025-06-07
 */
public class Booking extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 预订ID */
    private Long id;

    /** 酒店用户ID，关联hotel_user */
    @Excel(name = "酒店用户ID，关联hotel_user")
    private Long hotelUserId;

    /** 房间ID，关联room_info */
    @Excel(name = "房间ID，关联room_info")
    private Long roomId;

    /** 预订日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "预订日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date bookingDate;

    /** 入住开始日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "入住开始日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date startDate;

    /** 离店日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "离店日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date endDate;

    /** 预订状态，0待确认，1已确认，2取消 */
    @Excel(name = "预订状态，0待确认，1已确认，2取消")
    private Long status;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }

    public void setHotelUserId(Long hotelUserId) 
    {
        this.hotelUserId = hotelUserId;
    }

    public Long getHotelUserId() 
    {
        return hotelUserId;
    }

    public void setRoomId(Long roomId) 
    {
        this.roomId = roomId;
    }

    public Long getRoomId() 
    {
        return roomId;
    }

    public void setBookingDate(Date bookingDate) 
    {
        this.bookingDate = bookingDate;
    }

    public Date getBookingDate() 
    {
        return bookingDate;
    }

    public void setStartDate(Date startDate) 
    {
        this.startDate = startDate;
    }

    public Date getStartDate() 
    {
        return startDate;
    }

    public void setEndDate(Date endDate) 
    {
        this.endDate = endDate;
    }

    public Date getEndDate() 
    {
        return endDate;
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
            .append("hotelUserId", getHotelUserId())
            .append("roomId", getRoomId())
            .append("bookingDate", getBookingDate())
            .append("startDate", getStartDate())
            .append("endDate", getEndDate())
            .append("status", getStatus())
            .append("createTime", getCreateTime())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
