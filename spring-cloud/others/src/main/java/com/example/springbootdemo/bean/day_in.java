package com.example.springbootdemo.bean;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class day_in {
//    int id;
    String client_name;
    int room_id;
    String depart;

//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }

    public String getClient_name() throws ParseException {
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
//        System.out.println(formatter.format(date));

        SimpleDateFormat sdf1 =new SimpleDateFormat("yyyy-MM-dd");
        Date Date1=sdf1.parse(depart);
        Date Date2=sdf1.parse(formatter.format(date));

        Calendar c1=Calendar.getInstance();
        c1.setTime(Date1);//把获取的入住时间年月日放入Calendar中
        Calendar c2=Calendar.getInstance();
        c2.setTime(Date2);//把获取的退房时间年月日放入Calendar中

        int days = c2.get(Calendar.DAY_OF_YEAR) - c1.get(Calendar.DAY_OF_YEAR);

        if(days==0){
            this.client_name="*"+this.client_name;
        }
        return client_name;
    }

    public void setClient_name(String client_name) {
        this.client_name = client_name;
    }

    public int getRoom_id() {
        return room_id;
    }

    public void setRoom_id(int room_id) {
        this.room_id = room_id;
    }

    public String getDepart(){
        return depart;
    }

    public void setDepart(String depart) {
        this.depart = depart;
    }
}
