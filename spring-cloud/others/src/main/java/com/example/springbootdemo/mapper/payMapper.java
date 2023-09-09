package com.example.springbootdemo.mapper;

import com.example.springbootdemo.bean.pay;

import java.util.List;

public interface payMapper {
    void addpay(String id, String c_id, String price, String pay_date);

    void deletepay(String id);

    void updatepay(String id, String c_id, String price, String pay_date);

    List<pay> selectpay(String id, String c_id, String price, String pay_date);
}
