package com.ruoyi.info.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.info.mapper.RoomInfoMapper;
import com.ruoyi.info.domain.RoomInfo;
import com.ruoyi.info.service.IRoomInfoService;

/**
 * 客房信息Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-06-07
 */
@Service
public class RoomInfoServiceImpl implements IRoomInfoService 
{
    @Autowired
    private RoomInfoMapper roomInfoMapper;

    /**
     * 查询客房信息
     * 
     * @param id 客房信息主键
     * @return 客房信息
     */
    @Override
    public RoomInfo selectRoomInfoById(Long id)
    {
        return roomInfoMapper.selectRoomInfoById(id);
    }

    /**
     * 查询客房信息列表
     * 
     * @param roomInfo 客房信息
     * @return 客房信息
     */
    @Override
    public List<RoomInfo> selectRoomInfoList(RoomInfo roomInfo)
    {
        return roomInfoMapper.selectRoomInfoList(roomInfo);
    }

    /**
     * 新增客房信息
     * 
     * @param roomInfo 客房信息
     * @return 结果
     */
    @Override
    public int insertRoomInfo(RoomInfo roomInfo)
    {
        roomInfo.setCreateTime(DateUtils.getNowDate());
        return roomInfoMapper.insertRoomInfo(roomInfo);
    }

    /**
     * 修改客房信息
     * 
     * @param roomInfo 客房信息
     * @return 结果
     */
    @Override
    public int updateRoomInfo(RoomInfo roomInfo)
    {
        roomInfo.setUpdateTime(DateUtils.getNowDate());
        return roomInfoMapper.updateRoomInfo(roomInfo);
    }

    /**
     * 批量删除客房信息
     * 
     * @param ids 需要删除的客房信息主键
     * @return 结果
     */
    @Override
    public int deleteRoomInfoByIds(Long[] ids)
    {
        return roomInfoMapper.deleteRoomInfoByIds(ids);
    }

    /**
     * 删除客房信息信息
     * 
     * @param id 客房信息主键
     * @return 结果
     */
    @Override
    public int deleteRoomInfoById(Long id)
    {
        return roomInfoMapper.deleteRoomInfoById(id);
    }
}
