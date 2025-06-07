package com.ruoyi.announcement.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.announcement.domain.Announcement;
import com.ruoyi.announcement.service.IAnnouncementService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 公告管理Controller
 * 
 * @author ruoyi
 * @date 2025-06-07
 */
@RestController
@RequestMapping("/announcement/announcement")
public class AnnouncementController extends BaseController
{
    @Autowired
    private IAnnouncementService announcementService;

    /**
     * 查询公告管理列表
     */
    @PreAuthorize("@ss.hasPermi('announcement:announcement:list')")
    @GetMapping("/list")
    public TableDataInfo list(Announcement announcement)
    {
        startPage();
        List<Announcement> list = announcementService.selectAnnouncementList(announcement);
        return getDataTable(list);
    }

    /**
     * 导出公告管理列表
     */
    @PreAuthorize("@ss.hasPermi('announcement:announcement:export')")
    @Log(title = "公告管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, Announcement announcement)
    {
        List<Announcement> list = announcementService.selectAnnouncementList(announcement);
        ExcelUtil<Announcement> util = new ExcelUtil<Announcement>(Announcement.class);
        util.exportExcel(response, list, "公告管理数据");
    }

    /**
     * 获取公告管理详细信息
     */
    @PreAuthorize("@ss.hasPermi('announcement:announcement:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(announcementService.selectAnnouncementById(id));
    }

    /**
     * 新增公告管理
     */
    @PreAuthorize("@ss.hasPermi('announcement:announcement:add')")
    @Log(title = "公告管理", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody Announcement announcement)
    {
        return toAjax(announcementService.insertAnnouncement(announcement));
    }

    /**
     * 修改公告管理
     */
    @PreAuthorize("@ss.hasPermi('announcement:announcement:edit')")
    @Log(title = "公告管理", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Announcement announcement)
    {
        return toAjax(announcementService.updateAnnouncement(announcement));
    }

    /**
     * 删除公告管理
     */
    @PreAuthorize("@ss.hasPermi('announcement:announcement:remove')")
    @Log(title = "公告管理", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(announcementService.deleteAnnouncementByIds(ids));
    }
}
