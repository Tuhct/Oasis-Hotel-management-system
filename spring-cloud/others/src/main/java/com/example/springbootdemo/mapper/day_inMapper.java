package com.example.springbootdemo.mapper;

import com.example.springbootdemo.bean.day_in;

import java.util.List;

public interface day_inMapper {
    void addday(String room_id,String client_name,  String depart);

    void deleteday(String room_id);

    void updateday(String room_id,String client_name,  String depart);

    List<day_in> selectday(String room_id, String client_name, String depart);
}
