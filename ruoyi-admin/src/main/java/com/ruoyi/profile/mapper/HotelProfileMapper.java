package com.ruoyi.profile.mapper;

import java.util.List;
import com.ruoyi.profile.domain.HotelProfile;

/**
 * 酒店简介Mapper接口
 * 
 * @author ruoyi
 * @date 2025-06-07
 */
public interface HotelProfileMapper 
{
    /**
     * 查询酒店简介
     * 
     * @param id 酒店简介主键
     * @return 酒店简介
     */
    public HotelProfile selectHotelProfileById(Long id);

    /**
     * 查询酒店简介列表
     * 
     * @param hotelProfile 酒店简介
     * @return 酒店简介集合
     */
    public List<HotelProfile> selectHotelProfileList(HotelProfile hotelProfile);

    /**
     * 新增酒店简介
     * 
     * @param hotelProfile 酒店简介
     * @return 结果
     */
    public int insertHotelProfile(HotelProfile hotelProfile);

    /**
     * 修改酒店简介
     * 
     * @param hotelProfile 酒店简介
     * @return 结果
     */
    public int updateHotelProfile(HotelProfile hotelProfile);

    /**
     * 删除酒店简介
     * 
     * @param id 酒店简介主键
     * @return 结果
     */
    public int deleteHotelProfileById(Long id);

    /**
     * 批量删除酒店简介
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteHotelProfileByIds(Long[] ids);
}
