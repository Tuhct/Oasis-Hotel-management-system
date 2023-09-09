package com.yyt.service;

import com.yyt.domain.ReportIn;
import com.yyt.domain.ReportRevenue;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface ReportInService {

    /**
     * 保存
     * @param market
     * @return
     */
    public boolean save(ReportIn reportIn);

    /**
     * 修改
     * @param market
     * @return
     */
    public boolean update(ReportIn reportIn);

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
    public ReportIn getById(Integer id);

    /**
     * 查询全部
     * @return
     */
    public List<ReportIn> getAll();
}
