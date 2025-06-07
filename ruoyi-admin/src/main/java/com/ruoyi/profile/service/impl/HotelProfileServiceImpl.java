package com.ruoyi.profile.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.profile.mapper.HotelProfileMapper;
import com.ruoyi.profile.domain.HotelProfile;
import com.ruoyi.profile.service.IHotelProfileService;

/**
 * 酒店简介Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-06-07
 */
@Service
public class HotelProfileServiceImpl implements IHotelProfileService 
{
    @Autowired
    private HotelProfileMapper hotelProfileMapper;

    /**
     * 查询酒店简介
     * 
     * @param id 酒店简介主键
     * @return 酒店简介
     */
    @Override
    public HotelProfile selectHotelProfileById(Long id)
    {
        return hotelProfileMapper.selectHotelProfileById(id);
    }

    /**
     * 查询酒店简介列表
     * 
     * @param hotelProfile 酒店简介
     * @return 酒店简介
     */
    @Override
    public List<HotelProfile> selectHotelProfileList(HotelProfile hotelProfile)
    {
        return hotelProfileMapper.selectHotelProfileList(hotelProfile);
    }

    /**
     * 新增酒店简介
     * 
     * @param hotelProfile 酒店简介
     * @return 结果
     */
    @Override
    public int insertHotelProfile(HotelProfile hotelProfile)
    {
        hotelProfile.setCreateTime(DateUtils.getNowDate());
        return hotelProfileMapper.insertHotelProfile(hotelProfile);
    }

    /**
     * 修改酒店简介
     * 
     * @param hotelProfile 酒店简介
     * @return 结果
     */
    @Override
    public int updateHotelProfile(HotelProfile hotelProfile)
    {
        hotelProfile.setUpdateTime(DateUtils.getNowDate());
        return hotelProfileMapper.updateHotelProfile(hotelProfile);
    }

    /**
     * 批量删除酒店简介
     * 
     * @param ids 需要删除的酒店简介主键
     * @return 结果
     */
    @Override
    public int deleteHotelProfileByIds(Long[] ids)
    {
        return hotelProfileMapper.deleteHotelProfileByIds(ids);
    }

    /**
     * 删除酒店简介信息
     * 
     * @param id 酒店简介主键
     * @return 结果
     */
    @Override
    public int deleteHotelProfileById(Long id)
    {
        return hotelProfileMapper.deleteHotelProfileById(id);
    }
}
