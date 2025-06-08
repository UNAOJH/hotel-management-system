package com.ruoyi.extend.service;

import java.util.List;
import com.ruoyi.extend.domain.SysUserExtend;

/**
 * 用户扩展Service接口
 * 
 * @author ruoyi
 * @date 2025-06-08
 */
public interface ISysUserExtendService 
{
    /**
     * 查询用户扩展
     * 
     * @param userId 用户扩展主键
     * @return 用户扩展
     */
    public SysUserExtend selectSysUserExtendByUserId(Long userId);

    /**
     * 查询用户扩展列表
     * 
     * @param sysUserExtend 用户扩展
     * @return 用户扩展集合
     */
    public List<SysUserExtend> selectSysUserExtendList(SysUserExtend sysUserExtend);

    /**
     * 新增用户扩展
     * 
     * @param sysUserExtend 用户扩展
     * @return 结果
     */
    public int insertSysUserExtend(SysUserExtend sysUserExtend);

    /**
     * 修改用户扩展
     * 
     * @param sysUserExtend 用户扩展
     * @return 结果
     */
    public int updateSysUserExtend(SysUserExtend sysUserExtend);

    /**
     * 批量删除用户扩展
     * 
     * @param userIds 需要删除的用户扩展主键集合
     * @return 结果
     */
    public int deleteSysUserExtendByUserIds(Long[] userIds);

    /**
     * 删除用户扩展信息
     * 
     * @param userId 用户扩展主键
     * @return 结果
     */
    public int deleteSysUserExtendByUserId(Long userId);
}
