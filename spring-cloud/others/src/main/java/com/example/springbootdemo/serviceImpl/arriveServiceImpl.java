package com.example.springbootdemo.serviceImpl;

import com.example.springbootdemo.bean.arrive;
import com.example.springbootdemo.mapper.arriveMapper;
import com.example.springbootdemo.service.arriveService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class arriveServiceImpl implements arriveService {
    @Resource
    arriveMapper arrivemapper;

    @Override
    public void addarr(String client_name, String room_id,String arrive_date,String book_type, String depart) {
        arrivemapper.addarr(client_name,room_id,arrive_date,book_type,depart);
    }

    @Override
    public void deletearr(String client_name, String room_id,String arrive_date) {
        arrivemapper.deletearr(client_name,room_id,arrive_date);
    }

    @Override
    public void updatearr(String client_name, String room_id,String arrive_date,String book_type, String depart) {
        arrivemapper.updatearr(client_name,room_id,arrive_date,book_type,depart);
    }

    @Override
    public List<arrive> selectarr(String client_name, String room_id,String arrive_date,String book_type, String depart) {
        return arrivemapper.selectarr(client_name,room_id,arrive_date,book_type,depart);
    }
}
