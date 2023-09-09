package com.example.springbootdemo.mapper;

import com.example.springbootdemo.bean.ticket;

import java.util.List;

public interface ticketMapper {
    void addticket(String id, String c_email, String message);

    void deleteticket(String id);

    void updateticket(String id, String c_email, String message);

    List<ticket> selectticket(String id, String c_email, String message);
}
