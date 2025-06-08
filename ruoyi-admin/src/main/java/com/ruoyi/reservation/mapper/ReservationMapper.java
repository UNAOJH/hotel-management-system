package com.ruoyi.reservation.mapper;

import java.util.List;
import com.ruoyi.reservation.domain.Reservation;

/**
 * 预定信息Mapper接口
 * 
 * @author ruoyi
 * @date 2025-06-08
 */
public interface ReservationMapper 
{
    /**
     * 查询预定信息
     * 
     * @param id 预定信息主键
     * @return 预定信息
     */
    public Reservation selectReservationById(Long id);

    /**
     * 查询预定信息列表
     * 
     * @param reservation 预定信息
     * @return 预定信息集合
     */
    public List<Reservation> selectReservationList(Reservation reservation);

    /**
     * 新增预定信息
     * 
     * @param reservation 预定信息
     * @return 结果
     */
    public int insertReservation(Reservation reservation);

    /**
     * 修改预定信息
     * 
     * @param reservation 预定信息
     * @return 结果
     */
    public int updateReservation(Reservation reservation);

    /**
     * 删除预定信息
     * 
     * @param id 预定信息主键
     * @return 结果
     */
    public int deleteReservationById(Long id);

    /**
     * 批量删除预定信息
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteReservationByIds(Long[] ids);
}
