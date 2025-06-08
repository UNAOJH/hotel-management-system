package com.ruoyi.reservation.controller;

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
import com.ruoyi.reservation.domain.Reservation;
import com.ruoyi.reservation.service.IReservationService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 预定信息Controller
 * 
 * @author ruoyi
 * @date 2025-06-08
 */
@RestController
@RequestMapping("/reservation/reservation")
public class ReservationController extends BaseController
{
    @Autowired
    private IReservationService reservationService;

    /**
     * 查询预定信息列表
     */
    @PreAuthorize("@ss.hasPermi('reservation:reservation:list')")
    @GetMapping("/list")
    public TableDataInfo list(Reservation reservation)
    {
        startPage();
        List<Reservation> list = reservationService.selectReservationList(reservation);
        return getDataTable(list);
    }

    /**
     * 导出预定信息列表
     */
    @PreAuthorize("@ss.hasPermi('reservation:reservation:export')")
    @Log(title = "预定信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, Reservation reservation)
    {
        List<Reservation> list = reservationService.selectReservationList(reservation);
        ExcelUtil<Reservation> util = new ExcelUtil<Reservation>(Reservation.class);
        util.exportExcel(response, list, "预定信息数据");
    }

    /**
     * 获取预定信息详细信息
     */
    @PreAuthorize("@ss.hasPermi('reservation:reservation:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(reservationService.selectReservationById(id));
    }

    /**
     * 新增预定信息
     */
    @PreAuthorize("@ss.hasPermi('reservation:reservation:add')")
    @Log(title = "预定信息", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody Reservation reservation)
    {
        return toAjax(reservationService.insertReservation(reservation));
    }

    /**
     * 修改预定信息
     */
    @PreAuthorize("@ss.hasPermi('reservation:reservation:edit')")
    @Log(title = "预定信息", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Reservation reservation)
    {
        return toAjax(reservationService.updateReservation(reservation));
    }

    /**
     * 删除预定信息
     */
    @PreAuthorize("@ss.hasPermi('reservation:reservation:remove')")
    @Log(title = "预定信息", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(reservationService.deleteReservationByIds(ids));
    }
}
