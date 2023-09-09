package com.yyt.service.impl;

import com.yyt.controller.Code;
import com.yyt.dao.ReportRevenueDao;
import com.yyt.dao.RewardDao;
import com.yyt.domain.ReportRevenue;
import com.yyt.domain.Reward;
import com.yyt.exception.BusinessException;
import com.yyt.service.ReportRevenueService;
import com.yyt.service.RewardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RewardServiceImpl implements RewardService {
    @Autowired
    private RewardDao rewardDao;

    public boolean save(Reward reward) {
        return rewardDao.save(reward) > 0;
    }

    public boolean update(Reward reward) {
        return rewardDao.update(reward) > 0;
    }

    public boolean delete(Integer id) {
        return rewardDao.delete(id) > 0;
    }

    public Reward getById(Integer id) {
//        if(id == 1){
//            throw new BusinessException(Code.BUSINESS_ERR,"出错了，bro");
//        }
        return rewardDao.getById(id);
    }

    public List<Reward> getAll() {
        return rewardDao.getAll();
    }
}
