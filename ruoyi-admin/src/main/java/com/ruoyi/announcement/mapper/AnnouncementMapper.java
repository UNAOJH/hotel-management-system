package com.ruoyi.announcement.mapper;

import java.util.List;
import com.ruoyi.announcement.domain.Announcement;

/**
 * 公告管理Mapper接口
 * 
 * @author ruoyi
 * @date 2025-06-07
 */
public interface AnnouncementMapper 
{
    /**
     * 查询公告管理
     * 
     * @param id 公告管理主键
     * @return 公告管理
     */
    public Announcement selectAnnouncementById(Long id);

    /**
     * 查询公告管理列表
     * 
     * @param announcement 公告管理
     * @return 公告管理集合
     */
    public List<Announcement> selectAnnouncementList(Announcement announcement);

    /**
     * 新增公告管理
     * 
     * @param announcement 公告管理
     * @return 结果
     */
    public int insertAnnouncement(Announcement announcement);

    /**
     * 修改公告管理
     * 
     * @param announcement 公告管理
     * @return 结果
     */
    public int updateAnnouncement(Announcement announcement);

    /**
     * 删除公告管理
     * 
     * @param id 公告管理主键
     * @return 结果
     */
    public int deleteAnnouncementById(Long id);

    /**
     * 批量删除公告管理
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteAnnouncementByIds(Long[] ids);
}
