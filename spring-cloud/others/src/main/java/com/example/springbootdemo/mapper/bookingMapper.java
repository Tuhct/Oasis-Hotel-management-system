package com.example.springbootdemo.mapper;

import com.example.springbootdemo.bean.booking;

import java.util.List;

public interface bookingMapper {
    void addbooking(String book_id, String c_id, String book_type, String depart, String occupancy, String price);

    void deletebooking(String book_id);

    void updatebooking(String book_id, String c_id, String book_type, String depart, String occupancy, String price);

    List<booking> selectbooking(String book_id, String c_id, String book_type, String depart, String occupancy, String price);
}
