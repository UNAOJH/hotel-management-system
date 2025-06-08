package com.ruoyi.in.controller;

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
import com.ruoyi.in.domain.CheckIn;
import com.ruoyi.in.service.ICheckInService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 入住信息Controller
 * 
 * @author ruoyi
 * @date 2025-06-08
 */
@RestController
@RequestMapping("/in/in")
public class CheckInController extends BaseController
{
    @Autowired
    private ICheckInService checkInService;

    /**
     * 查询入住信息列表
     */
    @PreAuthorize("@ss.hasPermi('in:in:list')")
    @GetMapping("/list")
    public TableDataInfo list(CheckIn checkIn)
    {
        startPage();
        List<CheckIn> list = checkInService.selectCheckInList(checkIn);
        return getDataTable(list);
    }

    /**
     * 导出入住信息列表
     */
    @PreAuthorize("@ss.hasPermi('in:in:export')")
    @Log(title = "入住信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, CheckIn checkIn)
    {
        List<CheckIn> list = checkInService.selectCheckInList(checkIn);
        ExcelUtil<CheckIn> util = new ExcelUtil<CheckIn>(CheckIn.class);
        util.exportExcel(response, list, "入住信息数据");
    }

    /**
     * 获取入住信息详细信息
     */
    @PreAuthorize("@ss.hasPermi('in:in:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(checkInService.selectCheckInById(id));
    }

    /**
     * 新增入住信息
     */
    @PreAuthorize("@ss.hasPermi('in:in:add')")
    @Log(title = "入住信息", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody CheckIn checkIn)
    {
        return toAjax(checkInService.insertCheckIn(checkIn));
    }

    /**
     * 修改入住信息
     */
    @PreAuthorize("@ss.hasPermi('in:in:edit')")
    @Log(title = "入住信息", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody CheckIn checkIn)
    {
        return toAjax(checkInService.updateCheckIn(checkIn));
    }

    /**
     * 删除入住信息
     */
    @PreAuthorize("@ss.hasPermi('in:in:remove')")
    @Log(title = "入住信息", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(checkInService.deleteCheckInByIds(ids));
    }
}
