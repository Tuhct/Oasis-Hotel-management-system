package com.yyt.service;

import com.yyt.domain.BasePrice;
import com.yyt.domain.ReportRevenue;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface BasePriceService {

    /**
     * 保存
     * @return
     */
    public boolean save(BasePrice basePrice);

    /**
     * 修改
     * @param basePrice
     * @return
     */
    public boolean update(BasePrice basePrice);

    /**
     * 按id删除
     * @param id
     * @return
     */
    public boolean delete(Integer id);

    /**
     * 按id查询
     * @param id
     * @return
     */
    public BasePrice getById(Integer id);

    /**
     * 查询全部
     * @return
     */
    public List<BasePrice> getAll();
}
