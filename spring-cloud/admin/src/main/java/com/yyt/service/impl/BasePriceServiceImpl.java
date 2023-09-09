package com.yyt.service.impl;

import com.yyt.controller.Code;
import com.yyt.dao.BasePriceDao;
import com.yyt.dao.ReportRevenueDao;
import com.yyt.domain.BasePrice;
import com.yyt.domain.ReportRevenue;
import com.yyt.exception.BusinessException;
import com.yyt.service.BasePriceService;
import com.yyt.service.ReportRevenueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BasePriceServiceImpl implements BasePriceService {
    @Autowired
    private BasePriceDao basePriceDao;

    public boolean save(BasePrice basePrice) {
        return basePriceDao.save(basePrice) > 0;
    }

    public boolean update(BasePrice basePrice) {
        return basePriceDao.update(basePrice) > 0;
    }

    public boolean delete(Integer id) {
        return basePriceDao.delete(id) > 0;
    }

    public BasePrice getById(Integer id) {
//        if(id == 1){
//            throw new BusinessException(Code.BUSINESS_ERR,"出错了，bro");
//        }
        return basePriceDao.getById(id);
    }

    public List<BasePrice> getAll() {
        return basePriceDao.getAll();
    }
}
