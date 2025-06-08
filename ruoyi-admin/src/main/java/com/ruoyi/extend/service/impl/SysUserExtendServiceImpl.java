package com.ruoyi.extend.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.extend.mapper.SysUserExtendMapper;
import com.ruoyi.extend.domain.SysUserExtend;
import com.ruoyi.extend.service.ISysUserExtendService;

/**
 * 用户扩展Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-06-08
 */
@Service
public class SysUserExtendServiceImpl implements ISysUserExtendService 
{
    @Autowired
    private SysUserExtendMapper sysUserExtendMapper;

    /**
     * 查询用户扩展
     * 
     * @param userId 用户扩展主键
     * @return 用户扩展
     */
    @Override
    public SysUserExtend selectSysUserExtendByUserId(Long userId)
    {
        return sysUserExtendMapper.selectSysUserExtendByUserId(userId);
    }

    /**
     * 查询用户扩展列表
     * 
     * @param sysUserExtend 用户扩展
     * @return 用户扩展
     */
    @Override
    public List<SysUserExtend> selectSysUserExtendList(SysUserExtend sysUserExtend)
    {
        return sysUserExtendMapper.selectSysUserExtendList(sysUserExtend);
    }

    /**
     * 新增用户扩展
     * 
     * @param sysUserExtend 用户扩展
     * @return 结果
     */
    @Override
    public int insertSysUserExtend(SysUserExtend sysUserExtend)
    {
        return sysUserExtendMapper.insertSysUserExtend(sysUserExtend);
    }

    /**
     * 修改用户扩展
     * 
     * @param sysUserExtend 用户扩展
     * @return 结果
     */
    @Override
    public int updateSysUserExtend(SysUserExtend sysUserExtend)
    {
        return sysUserExtendMapper.updateSysUserExtend(sysUserExtend);
    }

    /**
     * 批量删除用户扩展
     * 
     * @param userIds 需要删除的用户扩展主键
     * @return 结果
     */
    @Override
    public int deleteSysUserExtendByUserIds(Long[] userIds)
    {
        return sysUserExtendMapper.deleteSysUserExtendByUserIds(userIds);
    }

    /**
     * 删除用户扩展信息
     * 
     * @param userId 用户扩展主键
     * @return 结果
     */
    @Override
    public int deleteSysUserExtendByUserId(Long userId)
    {
        return sysUserExtendMapper.deleteSysUserExtendByUserId(userId);
    }
}
