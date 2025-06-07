package com.ruoyi.type.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.type.mapper.RoomTypeMapper;
import com.ruoyi.type.domain.RoomType;
import com.ruoyi.type.service.IRoomTypeService;

/**
 * 房型信息Service业务层处理
 * 
 * @author unaojh
 * @date 2025-06-07
 */
@Service
public class RoomTypeServiceImpl implements IRoomTypeService 
{
    @Autowired
    private RoomTypeMapper roomTypeMapper;

    /**
     * 查询房型信息
     * 
     * @param id 房型信息主键
     * @return 房型信息
     */
    @Override
    public RoomType selectRoomTypeById(Long id)
    {
        return roomTypeMapper.selectRoomTypeById(id);
    }

    /**
     * 查询房型信息列表
     * 
     * @param roomType 房型信息
     * @return 房型信息
     */
    @Override
    public List<RoomType> selectRoomTypeList(RoomType roomType)
    {
        return roomTypeMapper.selectRoomTypeList(roomType);
    }

    /**
     * 新增房型信息
     * 
     * @param roomType 房型信息
     * @return 结果
     */
    @Override
    public int insertRoomType(RoomType roomType)
    {
        roomType.setCreateTime(DateUtils.getNowDate());
        return roomTypeMapper.insertRoomType(roomType);
    }

    /**
     * 修改房型信息
     * 
     * @param roomType 房型信息
     * @return 结果
     */
    @Override
    public int updateRoomType(RoomType roomType)
    {
        roomType.setUpdateTime(DateUtils.getNowDate());
        return roomTypeMapper.updateRoomType(roomType);
    }

    /**
     * 批量删除房型信息
     * 
     * @param ids 需要删除的房型信息主键
     * @return 结果
     */
    @Override
    public int deleteRoomTypeByIds(Long[] ids)
    {
        return roomTypeMapper.deleteRoomTypeByIds(ids);
    }

    /**
     * 删除房型信息信息
     * 
     * @param id 房型信息主键
     * @return 结果
     */
    @Override
    public int deleteRoomTypeById(Long id)
    {
        return roomTypeMapper.deleteRoomTypeById(id);
    }
}
