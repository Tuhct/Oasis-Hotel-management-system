package com.example.springbootdemo.controller;

import com.example.springbootdemo.bean.booking;
import com.example.springbootdemo.bean.notice;
import com.example.springbootdemo.bean.pay;
import com.example.springbootdemo.bean.ticket;
import com.example.springbootdemo.service.bookingService;
import com.example.springbootdemo.service.noticeService;
import com.example.springbootdemo.service.payService;
import com.example.springbootdemo.service.ticketService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class yh {
    @Resource       //这个一定要加，这个是注入
    ticketService ticketservice;        //在运行过程中动态创建对象，不需要再静态new
    @RequestMapping(value = "/wdfd",method = RequestMethod.POST)
    public String wdfd(String id, String c_email, String message,Model model){

        List<ticket> ticketList= ticketservice.selectticket(id,c_email,message);
        model.addAttribute("Result",
                    "            <tr>\n" +
                            "                <th>罚单编号</th>\n" +
                            "                <th>客户邮箱</th>\n" +
                            "                <th>罚单内容</th>\n" +
                            "            </tr>");
        model.addAttribute("ticketList",ticketList);



        return "我的罚单";
    }
    //*********************************************************
    @Resource       //这个一定要加，这个是注入
    noticeService noticeservice;        //在运行过程中动态创建对象，不需要再静态new
    @RequestMapping(value = "/wdtz",method = RequestMethod.POST)
    public String wdtz(String id, String c_email, String message,Model model){

        List<notice> noticeList= noticeservice.selectnotice(id,c_email,message);
        model.addAttribute("Result",
                    "            <tr>\n" +
                            "                <th>通知编号</th>\n" +
                            "                <th>客户邮箱</th>\n" +
                            "                <th>通知内容</th>\n" +
                            "            </tr>");
        model.addAttribute("noticeList",noticeList);

        return "我的通知";
    }
    //************************************************************************************
    @Resource       //这个一定要加，这个是注入
            payService payservice;        //在运行过程中动态创建对象，不需要再静态new

    @RequestMapping(value = "/wddd",method = RequestMethod.POST)
    public String wddd(String id, String c_id, String price, String pay_date,Model model){
            List<pay> payList= payservice.selectpay(id,c_id,price,pay_date);
            model.addAttribute("Result",
                    "            <tr>\n" +
                            "                <th>订单编号</th>\n" +
                            "                <th>客户编号</th>\n" +
                            "                <th>价格</th>\n" +
                            "                <th>支付时间</th>\n" +
                            "            </tr>");
            model.addAttribute("payList",payList);
            return "我的订单";
    }

    //************************************************************************************
    @Resource       //这个一定要加，这个是注入
            bookingService bookingservice;        //在运行过程中动态创建对象，不需要再静态new

    @RequestMapping(value = "/yuding1", method = RequestMethod.POST)
    public  String yuding1(String book_id, String c_id, String book_type, String depart, String occupancy, String price, String deal,Model model) {
        if (deal.equals("取消预定")) {
            bookingservice.deletebooking(book_id);
            model.addAttribute("Result", "删除成功");
        } else if (deal.equals("修改预定")) {
            bookingservice.updatebooking(book_id, c_id, book_type, depart, occupancy, price);
            model.addAttribute("Result", "更新成功");
        } else if (deal.equals("预定")) {
            bookingservice.addbooking(book_id,c_id,book_type,depart,occupancy,price);
            model.addAttribute("Result","预定成功");
        }
        return "预定";
    }
}

