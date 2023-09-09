package com.example.springbootdemo.bean;

import java.text.SimpleDateFormat;
import java.util.Date;

public class arrive {
    private int id;
    private String arrive_date;
    private String client_name;
    private String book_type;
    private String depart;
    private int room_id;

//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }

    public String getClient_name() {
        return client_name;
    }

    public void setClient_name(String client_name) {
        this.client_name = client_name;
    }

    public String getArrive_date() {
        return arrive_date;
    }

    public void setArrive_date(String arrive_date) {
        this.arrive_date = arrive_date;
    }

    public String getBook_type() {
        return book_type;
    }

    public void setBook_type(String book_type) {
        this.book_type = book_type;
    }

    public String getDepart() {
        return depart;
    }

    public void setDepart(String depart) {
        this.depart = depart;
    }

    public int getRoom_id() {
        return room_id;
    }

    public void setRoom_id(int room_id) {
        this.room_id = room_id;
    }
}
