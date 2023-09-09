package com.example.springbootdemo.service;

import com.example.springbootdemo.bean.notice;

import java.util.List;

public interface noticeService {
    void addnotice(String id, String c_email, String message);

    void deletenotice(String id);

    void updatenotice(String id, String c_email, String message);

    List<notice> selectnotice(String id, String c_email, String message);
}
