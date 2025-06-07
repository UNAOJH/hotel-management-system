package com.ruoyi.info.mapper;

import java.util.List;
import com.ruoyi.info.domain.RoomInfo;

/**
 * 客房信息Mapper接口
 * 
 * @author ruoyi
 * @date 2025-06-07
 */
public interface RoomInfoMapper 
{
    /**
     * 查询客房信息
     * 
     * @param id 客房信息主键
     * @return 客房信息
     */
    public RoomInfo selectRoomInfoById(Long id);

    /**
     * 查询客房信息列表
     * 
     * @param roomInfo 客房信息
     * @return 客房信息集合
     */
    public List<RoomInfo> selectRoomInfoList(RoomInfo roomInfo);

    /**
     * 新增客房信息
     * 
     * @param roomInfo 客房信息
     * @return 结果
     */
    public int insertRoomInfo(RoomInfo roomInfo);

    /**
     * 修改客房信息
     * 
     * @param roomInfo 客房信息
     * @return 结果
     */
    public int updateRoomInfo(RoomInfo roomInfo);

    /**
     * 删除客房信息
     * 
     * @param id 客房信息主键
     * @return 结果
     */
    public int deleteRoomInfoById(Long id);

    /**
     * 批量删除客房信息
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteRoomInfoByIds(Long[] ids);
}
