package com.ruoyi.carousel.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.carousel.mapper.CarouselMapper;
import com.ruoyi.carousel.domain.Carousel;
import com.ruoyi.carousel.service.ICarouselService;

/**
 * 轮播图管理Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-06-07
 */
@Service
public class CarouselServiceImpl implements ICarouselService 
{
    @Autowired
    private CarouselMapper carouselMapper;

    /**
     * 查询轮播图管理
     * 
     * @param id 轮播图管理主键
     * @return 轮播图管理
     */
    @Override
    public Carousel selectCarouselById(Long id)
    {
        return carouselMapper.selectCarouselById(id);
    }

    /**
     * 查询轮播图管理列表
     * 
     * @param carousel 轮播图管理
     * @return 轮播图管理
     */
    @Override
    public List<Carousel> selectCarouselList(Carousel carousel)
    {
        return carouselMapper.selectCarouselList(carousel);
    }

    /**
     * 新增轮播图管理
     * 
     * @param carousel 轮播图管理
     * @return 结果
     */
    @Override
    public int insertCarousel(Carousel carousel)
    {
        carousel.setCreateTime(DateUtils.getNowDate());
        return carouselMapper.insertCarousel(carousel);
    }

    /**
     * 修改轮播图管理
     * 
     * @param carousel 轮播图管理
     * @return 结果
     */
    @Override
    public int updateCarousel(Carousel carousel)
    {
        carousel.setUpdateTime(DateUtils.getNowDate());
        return carouselMapper.updateCarousel(carousel);
    }

    /**
     * 批量删除轮播图管理
     * 
     * @param ids 需要删除的轮播图管理主键
     * @return 结果
     */
    @Override
    public int deleteCarouselByIds(Long[] ids)
    {
        return carouselMapper.deleteCarouselByIds(ids);
    }

    /**
     * 删除轮播图管理信息
     * 
     * @param id 轮播图管理主键
     * @return 结果
     */
    @Override
    public int deleteCarouselById(Long id)
    {
        return carouselMapper.deleteCarouselById(id);
    }
}
