package com.ruoyi.in.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.in.mapper.CheckInMapper;
import com.ruoyi.in.domain.CheckIn;
import com.ruoyi.in.service.ICheckInService;

/**
 * 入住信息Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-06-08
 */
@Service
public class CheckInServiceImpl implements ICheckInService 
{
    @Autowired
    private CheckInMapper checkInMapper;

    /**
     * 查询入住信息
     * 
     * @param id 入住信息主键
     * @return 入住信息
     */
    @Override
    public CheckIn selectCheckInById(Long id)
    {
        return checkInMapper.selectCheckInById(id);
    }

    /**
     * 查询入住信息列表
     * 
     * @param checkIn 入住信息
     * @return 入住信息
     */
    @Override
    public List<CheckIn> selectCheckInList(CheckIn checkIn)
    {
        return checkInMapper.selectCheckInList(checkIn);
    }

    /**
     * 新增入住信息
     * 
     * @param checkIn 入住信息
     * @return 结果
     */
    @Override
    public int insertCheckIn(CheckIn checkIn)
    {
        return checkInMapper.insertCheckIn(checkIn);
    }

    /**
     * 修改入住信息
     * 
     * @param checkIn 入住信息
     * @return 结果
     */
    @Override
    public int updateCheckIn(CheckIn checkIn)
    {
        return checkInMapper.updateCheckIn(checkIn);
    }

    /**
     * 批量删除入住信息
     * 
     * @param ids 需要删除的入住信息主键
     * @return 结果
     */
    @Override
    public int deleteCheckInByIds(Long[] ids)
    {
        return checkInMapper.deleteCheckInByIds(ids);
    }

    /**
     * 删除入住信息信息
     * 
     * @param id 入住信息主键
     * @return 结果
     */
    @Override
    public int deleteCheckInById(Long id)
    {
        return checkInMapper.deleteCheckInById(id);
    }
}
