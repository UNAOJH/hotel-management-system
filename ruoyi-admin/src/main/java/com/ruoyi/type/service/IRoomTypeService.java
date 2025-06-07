package com.ruoyi.type.service;

import java.util.List;
import com.ruoyi.type.domain.RoomType;

/**
 * 房型信息Service接口
 * 
 * @author unaojh
 * @date 2025-06-07
 */
public interface IRoomTypeService 
{
    /**
     * 查询房型信息
     * 
     * @param id 房型信息主键
     * @return 房型信息
     */
    public RoomType selectRoomTypeById(Long id);

    /**
     * 查询房型信息列表
     * 
     * @param roomType 房型信息
     * @return 房型信息集合
     */
    public List<RoomType> selectRoomTypeList(RoomType roomType);

    /**
     * 新增房型信息
     * 
     * @param roomType 房型信息
     * @return 结果
     */
    public int insertRoomType(RoomType roomType);

    /**
     * 修改房型信息
     * 
     * @param roomType 房型信息
     * @return 结果
     */
    public int updateRoomType(RoomType roomType);

    /**
     * 批量删除房型信息
     * 
     * @param ids 需要删除的房型信息主键集合
     * @return 结果
     */
    public int deleteRoomTypeByIds(Long[] ids);

    /**
     * 删除房型信息信息
     * 
     * @param id 房型信息主键
     * @return 结果
     */
    public int deleteRoomTypeById(Long id);
}
