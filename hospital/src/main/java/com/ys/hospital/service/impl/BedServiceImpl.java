package com.ys.hospital.service.impl;

import com.ys.hospital.pojo.Bed;
import com.ys.hospital.dao.BedMapper;
import com.ys.hospital.service.BedService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Bed)表服务实现类
 *
 * @author yusheng
 * @since 2019-10-09 09:00:06
 */
@Service("bedService")
public class BedServiceImpl implements BedService {
    private static final Logger logger = LoggerFactory.getLogger(BedServiceImpl.class);
    
    @Resource
    private BedMapper bedMapper;

    /**
     * 查询所有Bed信息
     *
     * @return 对象Bed列表
     */
    @Override
    public List<Bed> queryAllBed() {
        return this.bedMapper.queryAllBed();
    }

    /**
     * 新增Bed数据
     *
     * @param bed 实例对象
     * @return 是否成功(1：成功|0：失败)
     */
    @Override
    public int insertBed(Bed bed) {
        return this.bedMapper.insertBed(bed);
    }

    /**
     * 修改Bed数据
     *
     * @param bed 实例对象
     * @return 是否成功(1：成功|0：失败)
     */
    @Override
    public int updateBed(Bed bed) {
        return this.bedMapper.updateBed(bed);
    }

    /**
     * 通过主键删除Bed数据
     *
     * @param bedId 主键
     * @return 是否成功(1：成功|0：失败)
     */
    @Override
    public int deleteBedById(Integer bedId) {
        return this.bedMapper.deleteBedById(bedId);
    }
}