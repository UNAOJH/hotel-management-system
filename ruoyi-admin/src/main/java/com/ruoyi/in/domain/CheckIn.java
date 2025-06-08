package com.ruoyi.in.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 入住信息对象 biz_check_in
 * 
 * @author ruoyi
 * @date 2025-06-08
 */
public class CheckIn extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 入住ID */
    private Long id;

    /** 关联预订ID */
    @Excel(name = "关联预订ID")
    private Long reservationId;

    /** 入住日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "入住日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date checkInDate;

    /** 退房日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "退房日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date checkOutDate;

    /** 入住人姓名 */
    @Excel(name = "入住人姓名")
    private String guestName;

    /** 身份证号 */
    @Excel(name = "身份证号")
    private String guestIdNumber;

    /** 是否已入住 */
    @Excel(name = "是否已入住")
    private Integer checkInStatus;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }

    public void setReservationId(Long reservationId) 
    {
        this.reservationId = reservationId;
    }

    public Long getReservationId() 
    {
        return reservationId;
    }

    public void setCheckInDate(Date checkInDate) 
    {
        this.checkInDate = checkInDate;
    }

    public Date getCheckInDate() 
    {
        return checkInDate;
    }

    public void setCheckOutDate(Date checkOutDate) 
    {
        this.checkOutDate = checkOutDate;
    }

    public Date getCheckOutDate() 
    {
        return checkOutDate;
    }

    public void setGuestName(String guestName) 
    {
        this.guestName = guestName;
    }

    public String getGuestName() 
    {
        return guestName;
    }

    public void setGuestIdNumber(String guestIdNumber) 
    {
        this.guestIdNumber = guestIdNumber;
    }

    public String getGuestIdNumber() 
    {
        return guestIdNumber;
    }

    public void setCheckInStatus(Integer checkInStatus) 
    {
        this.checkInStatus = checkInStatus;
    }

    public Integer getCheckInStatus() 
    {
        return checkInStatus;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("reservationId", getReservationId())
            .append("checkInDate", getCheckInDate())
            .append("checkOutDate", getCheckOutDate())
            .append("guestName", getGuestName())
            .append("guestIdNumber", getGuestIdNumber())
            .append("checkInStatus", getCheckInStatus())
            .append("remark", getRemark())
            .toString();
    }
}
