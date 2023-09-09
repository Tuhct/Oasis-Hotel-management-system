package com.example.springbootdemo.serviceImpl;

import com.example.springbootdemo.bean.ticket;
import com.example.springbootdemo.mapper.ticketMapper;
import com.example.springbootdemo.service.ticketService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ticketServiceImpl implements ticketService {
    @Resource
    ticketMapper ticketmapper;

    @Override
    public void addticket(String id, String c_email, String message) {
        ticketmapper.addticket(id,c_email,message);
    }

    @Override
    public void deleteticket(String id) {
        ticketmapper.deleteticket(id);
    }

    @Override
    public void updateticket(String id, String c_email, String message) {
        ticketmapper.updateticket(id,c_email,message);
    }

    @Override
    public List<ticket> selectticket(String id, String c_email, String message) {
        return ticketmapper.selectticket(id,c_email,message);
    }
}
