package com.example.springbootdemo.mapper;

import com.example.springbootdemo.bean.arrive;

import java.util.List;

public interface arriveMapper {
    void addarr(String client_name, String room_id,String arrive_date,String book_type, String depart);

    void deletearr(String client_name, String room_id,String arrive_date);

    void updatearr(String client_name, String room_id,String arrive_date,String book_type, String depart);

    List<arrive> selectarr(String client_name, String room_id,String arrive_date,String book_type, String depart);
}
