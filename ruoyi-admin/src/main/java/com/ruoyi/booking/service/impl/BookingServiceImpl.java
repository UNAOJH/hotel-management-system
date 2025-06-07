package com.ruoyi.booking.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.booking.mapper.BookingMapper;
import com.ruoyi.booking.domain.Booking;
import com.ruoyi.booking.service.IBookingService;

/**
 * 预订信息Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-06-07
 */
@Service
public class BookingServiceImpl implements IBookingService 
{
    @Autowired
    private BookingMapper bookingMapper;

    /**
     * 查询预订信息
     * 
     * @param id 预订信息主键
     * @return 预订信息
     */
    @Override
    public Booking selectBookingById(Long id)
    {
        return bookingMapper.selectBookingById(id);
    }

    /**
     * 查询预订信息列表
     * 
     * @param booking 预订信息
     * @return 预订信息
     */
    @Override
    public List<Booking> selectBookingList(Booking booking)
    {
        return bookingMapper.selectBookingList(booking);
    }

    /**
     * 新增预订信息
     * 
     * @param booking 预订信息
     * @return 结果
     */
    @Override
    public int insertBooking(Booking booking)
    {
        booking.setCreateTime(DateUtils.getNowDate());
        return bookingMapper.insertBooking(booking);
    }

    /**
     * 修改预订信息
     * 
     * @param booking 预订信息
     * @return 结果
     */
    @Override
    public int updateBooking(Booking booking)
    {
        booking.setUpdateTime(DateUtils.getNowDate());
        return bookingMapper.updateBooking(booking);
    }

    /**
     * 批量删除预订信息
     * 
     * @param ids 需要删除的预订信息主键
     * @return 结果
     */
    @Override
    public int deleteBookingByIds(Long[] ids)
    {
        return bookingMapper.deleteBookingByIds(ids);
    }

    /**
     * 删除预订信息信息
     * 
     * @param id 预订信息主键
     * @return 结果
     */
    @Override
    public int deleteBookingById(Long id)
    {
        return bookingMapper.deleteBookingById(id);
    }
}
