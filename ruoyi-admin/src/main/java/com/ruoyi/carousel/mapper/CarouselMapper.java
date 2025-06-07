package com.ruoyi.carousel.mapper;

import java.util.List;
import com.ruoyi.carousel.domain.Carousel;

/**
 * 轮播图管理Mapper接口
 * 
 * @author ruoyi
 * @date 2025-06-07
 */
public interface CarouselMapper 
{
    /**
     * 查询轮播图管理
     * 
     * @param id 轮播图管理主键
     * @return 轮播图管理
     */
    public Carousel selectCarouselById(Long id);

    /**
     * 查询轮播图管理列表
     * 
     * @param carousel 轮播图管理
     * @return 轮播图管理集合
     */
    public List<Carousel> selectCarouselList(Carousel carousel);

    /**
     * 新增轮播图管理
     * 
     * @param carousel 轮播图管理
     * @return 结果
     */
    public int insertCarousel(Carousel carousel);

    /**
     * 修改轮播图管理
     * 
     * @param carousel 轮播图管理
     * @return 结果
     */
    public int updateCarousel(Carousel carousel);

    /**
     * 删除轮播图管理
     * 
     * @param id 轮播图管理主键
     * @return 结果
     */
    public int deleteCarouselById(Long id);

    /**
     * 批量删除轮播图管理
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteCarouselByIds(Long[] ids);
}
