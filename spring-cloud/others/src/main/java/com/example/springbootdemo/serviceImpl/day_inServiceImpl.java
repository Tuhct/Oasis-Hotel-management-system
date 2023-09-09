package com.example.springbootdemo.serviceImpl;

import com.example.springbootdemo.bean.day_in;
import com.example.springbootdemo.mapper.day_inMapper;
import com.example.springbootdemo.service.day_inService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class day_inServiceImpl implements day_inService {
    @Resource
    day_inMapper day_inMapper1;

    @Override
    public void addday( String room_id, String client_name,String depart) {
        day_inMapper1.addday(room_id,client_name,depart);
    }

    @Override
    public void deleteday(String room_id) {
        day_inMapper1.deleteday(room_id);
    }

    @Override
    public void updateday(String room_id, String client_name, String depart) {
        day_inMapper1.updateday(room_id,client_name,depart);
    }

    @Override
    public List<day_in> selectday( String room_id, String client_name,String depart) {
        return day_inMapper1.selectday(room_id,client_name,depart);
    }
}
