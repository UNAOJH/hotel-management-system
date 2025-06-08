package com.ruoyi.info.controller;

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
import com.ruoyi.info.domain.RoomInfo;
import com.ruoyi.info.service.IRoomInfoService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 客房信息Controller
 * 
 * @author ruoyi
 * @date 2025-06-08
 */
@RestController
@RequestMapping("/info/info")
public class RoomInfoController extends BaseController
{
    @Autowired
    private IRoomInfoService roomInfoService;

    /**
     * 查询客房信息列表
     */
    @PreAuthorize("@ss.hasPermi('info:info:list')")
    @GetMapping("/list")
    public TableDataInfo list(RoomInfo roomInfo)
    {
        startPage();
        List<RoomInfo> list = roomInfoService.selectRoomInfoList(roomInfo);
        return getDataTable(list);
    }

    /**
     * 导出客房信息列表
     */
    @PreAuthorize("@ss.hasPermi('info:info:export')")
    @Log(title = "客房信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, RoomInfo roomInfo)
    {
        List<RoomInfo> list = roomInfoService.selectRoomInfoList(roomInfo);
        ExcelUtil<RoomInfo> util = new ExcelUtil<RoomInfo>(RoomInfo.class);
        util.exportExcel(response, list, "客房信息数据");
    }

    /**
     * 获取客房信息详细信息
     */
    @PreAuthorize("@ss.hasPermi('info:info:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(roomInfoService.selectRoomInfoById(id));
    }

    /**
     * 新增客房信息
     */
    @PreAuthorize("@ss.hasPermi('info:info:add')")
    @Log(title = "客房信息", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody RoomInfo roomInfo)
    {
        return toAjax(roomInfoService.insertRoomInfo(roomInfo));
    }

    /**
     * 修改客房信息
     */
    @PreAuthorize("@ss.hasPermi('info:info:edit')")
    @Log(title = "客房信息", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody RoomInfo roomInfo)
    {
        return toAjax(roomInfoService.updateRoomInfo(roomInfo));
    }

    /**
     * 删除客房信息
     */
    @PreAuthorize("@ss.hasPermi('info:info:remove')")
    @Log(title = "客房信息", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(roomInfoService.deleteRoomInfoByIds(ids));
    }
}
