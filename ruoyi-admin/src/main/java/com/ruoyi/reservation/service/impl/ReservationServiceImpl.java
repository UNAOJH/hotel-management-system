package com.ruoyi.reservation.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.reservation.mapper.ReservationMapper;
import com.ruoyi.reservation.domain.Reservation;
import com.ruoyi.reservation.service.IReservationService;

/**
 * 预定信息Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-06-08
 */
@Service
public class ReservationServiceImpl implements IReservationService 
{
    @Autowired
    private ReservationMapper reservationMapper;

    /**
     * 查询预定信息
     * 
     * @param id 预定信息主键
     * @return 预定信息
     */
    @Override
    public Reservation selectReservationById(Long id)
    {
        return reservationMapper.selectReservationById(id);
    }

    /**
     * 查询预定信息列表
     * 
     * @param reservation 预定信息
     * @return 预定信息
     */
    @Override
    public List<Reservation> selectReservationList(Reservation reservation)
    {
        return reservationMapper.selectReservationList(reservation);
    }

    /**
     * 新增预定信息
     * 
     * @param reservation 预定信息
     * @return 结果
     */
    @Override
    public int insertReservation(Reservation reservation)
    {
        reservation.setCreateTime(DateUtils.getNowDate());
        return reservationMapper.insertReservation(reservation);
    }

    /**
     * 修改预定信息
     * 
     * @param reservation 预定信息
     * @return 结果
     */
    @Override
    public int updateReservation(Reservation reservation)
    {
        reservation.setUpdateTime(DateUtils.getNowDate());
        return reservationMapper.updateReservation(reservation);
    }

    /**
     * 批量删除预定信息
     * 
     * @param ids 需要删除的预定信息主键
     * @return 结果
     */
    @Override
    public int deleteReservationByIds(Long[] ids)
    {
        return reservationMapper.deleteReservationByIds(ids);
    }

    /**
     * 删除预定信息信息
     * 
     * @param id 预定信息主键
     * @return 结果
     */
    @Override
    public int deleteReservationById(Long id)
    {
        return reservationMapper.deleteReservationById(id);
    }
}
