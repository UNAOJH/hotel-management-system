package com.ruoyi.in.service;

import java.util.List;
import com.ruoyi.in.domain.CheckIn;

/**
 * 入住信息Service接口
 * 
 * @author ruoyi
 * @date 2025-06-08
 */
public interface ICheckInService 
{
    /**
     * 查询入住信息
     * 
     * @param id 入住信息主键
     * @return 入住信息
     */
    public CheckIn selectCheckInById(Long id);

    /**
     * 查询入住信息列表
     * 
     * @param checkIn 入住信息
     * @return 入住信息集合
     */
    public List<CheckIn> selectCheckInList(CheckIn checkIn);

    /**
     * 新增入住信息
     * 
     * @param checkIn 入住信息
     * @return 结果
     */
    public int insertCheckIn(CheckIn checkIn);

    /**
     * 修改入住信息
     * 
     * @param checkIn 入住信息
     * @return 结果
     */
    public int updateCheckIn(CheckIn checkIn);

    /**
     * 批量删除入住信息
     * 
     * @param ids 需要删除的入住信息主键集合
     * @return 结果
     */
    public int deleteCheckInByIds(Long[] ids);

    /**
     * 删除入住信息信息
     * 
     * @param id 入住信息主键
     * @return 结果
     */
    public int deleteCheckInById(Long id);
}
