package com.yyt.service.impl;

import com.yyt.controller.Code;
import com.yyt.dao.ReportInDao;
import com.yyt.dao.ReportRevenueDao;
import com.yyt.domain.ReportIn;
import com.yyt.domain.ReportRevenue;
import com.yyt.exception.BusinessException;
import com.yyt.service.ReportInService;
import com.yyt.service.ReportRevenueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReportInServiceImpl implements ReportInService {
    @Autowired
    private ReportInDao reportInDao;

    public boolean save(ReportIn reportIn) {
        return reportInDao.save(reportIn) > 0;
    }

    public boolean update(ReportIn reportIn) {
        return reportInDao.update(reportIn) > 0;
    }

    public boolean delete(Integer id) {
        return reportInDao.delete(id) > 0;
    }

    public ReportIn getById(Integer id) {
//        if(id == 1){
//            throw new BusinessException(Code.BUSINESS_ERR,"出错了，bro");
//        }
        return reportInDao.getById(id);
    }

    public List<ReportIn> getAll() {
        return reportInDao.getAll();
    }
}
