package com.ruoyi.announcement.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.announcement.mapper.AnnouncementMapper;
import com.ruoyi.announcement.domain.Announcement;
import com.ruoyi.announcement.service.IAnnouncementService;

/**
 * 公告管理Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-06-07
 */
@Service
public class AnnouncementServiceImpl implements IAnnouncementService 
{
    @Autowired
    private AnnouncementMapper announcementMapper;

    /**
     * 查询公告管理
     * 
     * @param id 公告管理主键
     * @return 公告管理
     */
    @Override
    public Announcement selectAnnouncementById(Long id)
    {
        return announcementMapper.selectAnnouncementById(id);
    }

    /**
     * 查询公告管理列表
     * 
     * @param announcement 公告管理
     * @return 公告管理
     */
    @Override
    public List<Announcement> selectAnnouncementList(Announcement announcement)
    {
        return announcementMapper.selectAnnouncementList(announcement);
    }

    /**
     * 新增公告管理
     * 
     * @param announcement 公告管理
     * @return 结果
     */
    @Override
    public int insertAnnouncement(Announcement announcement)
    {
        announcement.setCreateTime(DateUtils.getNowDate());
        return announcementMapper.insertAnnouncement(announcement);
    }

    /**
     * 修改公告管理
     * 
     * @param announcement 公告管理
     * @return 结果
     */
    @Override
    public int updateAnnouncement(Announcement announcement)
    {
        announcement.setUpdateTime(DateUtils.getNowDate());
        return announcementMapper.updateAnnouncement(announcement);
    }

    /**
     * 批量删除公告管理
     * 
     * @param ids 需要删除的公告管理主键
     * @return 结果
     */
    @Override
    public int deleteAnnouncementByIds(Long[] ids)
    {
        return announcementMapper.deleteAnnouncementByIds(ids);
    }

    /**
     * 删除公告管理信息
     * 
     * @param id 公告管理主键
     * @return 结果
     */
    @Override
    public int deleteAnnouncementById(Long id)
    {
        return announcementMapper.deleteAnnouncementById(id);
    }
}
