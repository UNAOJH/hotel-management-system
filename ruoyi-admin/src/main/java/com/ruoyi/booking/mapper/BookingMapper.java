package com.ruoyi.booking.mapper;

import java.util.List;
import com.ruoyi.booking.domain.Booking;

/**
 * 预订信息Mapper接口
 * 
 * @author ruoyi
 * @date 2025-06-07
 */
public interface BookingMapper 
{
    /**
     * 查询预订信息
     * 
     * @param id 预订信息主键
     * @return 预订信息
     */
    public Booking selectBookingById(Long id);

    /**
     * 查询预订信息列表
     * 
     * @param booking 预订信息
     * @return 预订信息集合
     */
    public List<Booking> selectBookingList(Booking booking);

    /**
     * 新增预订信息
     * 
     * @param booking 预订信息
     * @return 结果
     */
    public int insertBooking(Booking booking);

    /**
     * 修改预订信息
     * 
     * @param booking 预订信息
     * @return 结果
     */
    public int updateBooking(Booking booking);

    /**
     * 删除预订信息
     * 
     * @param id 预订信息主键
     * @return 结果
     */
    public int deleteBookingById(Long id);

    /**
     * 批量删除预订信息
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteBookingByIds(Long[] ids);
}
