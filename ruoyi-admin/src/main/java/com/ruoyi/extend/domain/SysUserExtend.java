package com.ruoyi.extend.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 用户扩展对象 sys_user_extend
 * 
 * @author ruoyi
 * @date 2025-06-08
 */
public class SysUserExtend extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 用户ID */
    private Long userId;

    /** 身份证 */
    @Excel(name = "身份证")
    private String idCard;

    /** 客户类型 */
    @Excel(name = "客户类型")
    private String customerType;

    public void setUserId(Long userId) 
    {
        this.userId = userId;
    }

    public Long getUserId() 
    {
        return userId;
    }

    public void setIdCard(String idCard) 
    {
        this.idCard = idCard;
    }

    public String getIdCard() 
    {
        return idCard;
    }

    public void setCustomerType(String customerType) 
    {
        this.customerType = customerType;
    }

    public String getCustomerType() 
    {
        return customerType;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("userId", getUserId())
            .append("idCard", getIdCard())
            .append("customerType", getCustomerType())
            .append("remark", getRemark())
            .toString();
    }
}
