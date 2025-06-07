package com.ruoyi.type.controller;

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
import com.ruoyi.type.domain.RoomType;
import com.ruoyi.type.service.IRoomTypeService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 房型信息Controller
 *
 * @author unaojh
 * @date 2025-06-07
 */
@RestController
@RequestMapping("/type/type")
public class RoomTypeController extends BaseController {
    @Autowired
    private IRoomTypeService roomTypeService;

    /**
     * 查询房型信息列表
     */
    @PreAuthorize("@ss.hasPermi('type:type:list')")
    @GetMapping("/list")
    public TableDataInfo list(RoomType roomType) {
        startPage();
        List<RoomType> list = roomTypeService.selectRoomTypeList(roomType);
        return getDataTable(list);
    }

    /**
     * 导出房型信息列表
     */
    @PreAuthorize("@ss.hasPermi('type:type:export')")
    @Log(title = "房型信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, RoomType roomType) {
        List<RoomType> list = roomTypeService.selectRoomTypeList(roomType);
        ExcelUtil<RoomType> util = new ExcelUtil<RoomType>(RoomType.class);
        util.exportExcel(response, list, "房型信息数据");
    }

    /**
     * 获取房型信息详细信息
     */
    @PreAuthorize("@ss.hasPermi('type:type:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id) {
        return success(roomTypeService.selectRoomTypeById(id));
    }

    /**
     * 新增房型信息
     */
    @PreAuthorize("@ss.hasPermi('type:type:add')")
    @Log(title = "房型信息", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody RoomType roomType) {
        return toAjax(roomTypeService.insertRoomType(roomType));
    }

    /**
     * 修改房型信息
     */
    @PreAuthorize("@ss.hasPermi('type:type:edit')")
    @Log(title = "房型信息", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody RoomType roomType) {
        return toAjax(roomTypeService.updateRoomType(roomType));
    }

    /**
     * 删除房型信息
     */
    @PreAuthorize("@ss.hasPermi('type:type:remove')")
    @Log(title = "房型信息", businessType = BusinessType.DELETE)
    @DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids) {
        return toAjax(roomTypeService.deleteRoomTypeByIds(ids));
    }
}
