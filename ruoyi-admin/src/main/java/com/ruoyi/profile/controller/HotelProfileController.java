package com.ruoyi.profile.controller;

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
import com.ruoyi.profile.domain.HotelProfile;
import com.ruoyi.profile.service.IHotelProfileService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 酒店简介Controller
 * 
 * @author ruoyi
 * @date 2025-06-07
 */
@RestController
@RequestMapping("/profile/profile")
public class HotelProfileController extends BaseController
{
    @Autowired
    private IHotelProfileService hotelProfileService;

    /**
     * 查询酒店简介列表
     */
    @PreAuthorize("@ss.hasPermi('profile:profile:list')")
    @GetMapping("/list")
    public TableDataInfo list(HotelProfile hotelProfile)
    {
        startPage();
        List<HotelProfile> list = hotelProfileService.selectHotelProfileList(hotelProfile);
        return getDataTable(list);
    }

    /**
     * 导出酒店简介列表
     */
    @PreAuthorize("@ss.hasPermi('profile:profile:export')")
    @Log(title = "酒店简介", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, HotelProfile hotelProfile)
    {
        List<HotelProfile> list = hotelProfileService.selectHotelProfileList(hotelProfile);
        ExcelUtil<HotelProfile> util = new ExcelUtil<HotelProfile>(HotelProfile.class);
        util.exportExcel(response, list, "酒店简介数据");
    }

    /**
     * 获取酒店简介详细信息
     */
    @PreAuthorize("@ss.hasPermi('profile:profile:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(hotelProfileService.selectHotelProfileById(id));
    }

    /**
     * 新增酒店简介
     */
    @PreAuthorize("@ss.hasPermi('profile:profile:add')")
    @Log(title = "酒店简介", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody HotelProfile hotelProfile)
    {
        return toAjax(hotelProfileService.insertHotelProfile(hotelProfile));
    }

    /**
     * 修改酒店简介
     */
    @PreAuthorize("@ss.hasPermi('profile:profile:edit')")
    @Log(title = "酒店简介", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody HotelProfile hotelProfile)
    {
        return toAjax(hotelProfileService.updateHotelProfile(hotelProfile));
    }

    /**
     * 删除酒店简介
     */
    @PreAuthorize("@ss.hasPermi('profile:profile:remove')")
    @Log(title = "酒店简介", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(hotelProfileService.deleteHotelProfileByIds(ids));
    }
}
