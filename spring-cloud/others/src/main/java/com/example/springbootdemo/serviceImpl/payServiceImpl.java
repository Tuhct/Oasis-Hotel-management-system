package com.example.springbootdemo.serviceImpl;

import com.example.springbootdemo.bean.pay;
import com.example.springbootdemo.mapper.payMapper;
import com.example.springbootdemo.service.payService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class payServiceImpl implements payService {
    @Resource
    payMapper paymapper;

    @Override
    public void addpay(String id, String c_id, String price, String pay_date) {
        paymapper.addpay(id,c_id,price,pay_date);
    }

    @Override
    public void deletepay(String id) {
        paymapper.deletepay(id);
    }

    @Override
    public void updatepay(String id, String c_id, String price, String pay_date) {
        paymapper.updatepay(id,c_id,price,pay_date);
    }

    @Override
    public List<pay> selectpay(String id, String c_id, String price, String pay_date) {
        return paymapper.selectpay(id,c_id,price,pay_date);
    }
}
