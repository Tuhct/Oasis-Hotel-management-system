package com.example.springbootdemo.serviceImpl;

import com.example.springbootdemo.bean.booking;
import com.example.springbootdemo.mapper.bookingMapper;
import com.example.springbootdemo.service.bookingService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class bookingServiceImpl implements bookingService {
    @Resource
    bookingMapper bookingMapper;

    @Override
    public void addbooking(String book_id, String c_id, String book_type,String depart,String occupancy,String price) {
        bookingMapper.addbooking(book_id,c_id,book_type,depart,occupancy,price);
    }

    @Override
    public void deletebooking(String book_id) {
        bookingMapper.deletebooking(book_id);
    }

    @Override
    public void updatebooking(String book_id, String c_id, String book_type,String depart,String occupancy,String price) {
        bookingMapper.updatebooking(book_id,c_id,book_type,depart,occupancy,price);
    }

    @Override
    public List<booking> selectbooking(String book_id, String c_id, String book_type,String depart,String occupancy,String price) {
        return bookingMapper.selectbooking(book_id,c_id,book_type,depart,occupancy,price);
    }
}

