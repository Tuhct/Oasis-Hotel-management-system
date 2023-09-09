package com.yyt.service;

import com.yyt.domain.ReportRevenue;
import com.yyt.domain.Reward;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface RewardService {

    /**
     * 保存
     * @param market
     * @return
     */
    public boolean save(Reward reward);

    /**
     * 修改
     * @param market
     * @return
     */
    public boolean update(Reward reward);

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
    public Reward getById(Integer id);

    /**
     * 查询全部
     * @return
     */
    public List<Reward> getAll();
}
