package com.yyt.service.impl;

import com.yyt.controller.Code;
import com.yyt.dao.ReportRevenueDao;
import com.yyt.domain.ReportRevenue;
import com.yyt.exception.BusinessException;
import com.yyt.service.ReportRevenueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReportRevenueServiceImpl implements ReportRevenueService {
    @Autowired
    private ReportRevenueDao reportRevenueDao;

    public boolean save(ReportRevenue reportRevenue) {
        return reportRevenueDao.save(reportRevenue) > 0;
    }

    public boolean update(ReportRevenue reportRevenue) {
        return reportRevenueDao.update(reportRevenue) > 0;
    }

    public boolean delete(Integer id) {
        return reportRevenueDao.delete(id) > 0;
    }

    public ReportRevenue getById(Integer id) {
//        if(id == 1){
//            throw new BusinessException(Code.BUSINESS_ERR,"出错了，bro");
//        }
        return reportRevenueDao.getById(id);
    }

    public List<ReportRevenue> getAll() {
        return reportRevenueDao.getAll();
    }
}
