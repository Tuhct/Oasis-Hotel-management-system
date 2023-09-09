package com.yyt.service;

import com.yyt.domain.ReportRevenue;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface ReportRevenueService {

    /**
     * 保存
     * @param market
     * @return
     */
    public boolean save(ReportRevenue reportRevenue);

    /**
     * 修改
     * @param market
     * @return
     */
    public boolean update(ReportRevenue reportRevenue);

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
    public ReportRevenue getById(Integer id);

    /**
     * 查询全部
     * @return
     */
    public List<ReportRevenue> getAll();
}
