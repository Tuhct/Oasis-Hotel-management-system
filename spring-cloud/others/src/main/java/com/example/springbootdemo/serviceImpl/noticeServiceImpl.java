package com.example.springbootdemo.serviceImpl;

import com.example.springbootdemo.bean.notice;
import com.example.springbootdemo.mapper.noticeMapper;
import com.example.springbootdemo.service.noticeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class noticeServiceImpl implements noticeService {
    @Resource
    noticeMapper noticemapper;

    @Override
    public void addnotice(String id, String c_email, String message) {
        noticemapper.addnotice(id,c_email,message);
    }

    @Override
    public void deletenotice(String id) {
        noticemapper.deletenotice(id);
    }

    @Override
    public void updatenotice(String id, String c_email, String message) {
        noticemapper.updatenotice(id,c_email,message);
    }

    @Override
    public List<notice> selectnotice(String id, String c_email, String message) {
        return noticemapper.selectnotice(id,c_email,message);
    }
}
