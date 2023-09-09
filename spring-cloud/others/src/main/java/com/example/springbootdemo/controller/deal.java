package com.example.springbootdemo.controller;

import com.example.springbootdemo.bean.notice;
import com.example.springbootdemo.bean.ticket;
import com.example.springbootdemo.service.noticeService;
import com.example.springbootdemo.service.ticketService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class deal {

    @Resource       //这个一定要加，这个是注入
    ticketService ticketservice;        //在运行过程中动态创建对象，不需要再静态new

    @RequestMapping("/SelecttickerById")
    public String SelecttickerById(String id,Model model){

        List<ticket> ticketList=ticketservice.selectticket(id,"","");
        model.addAttribute("show",ticketList);
        return "通知和罚单详情";


    }

    @Resource       //这个一定要加，这个是注入
    noticeService noticeservice;          //在运行过程中动态创建对象，不需要再静态new

    @RequestMapping("/SelecttickerById2")
    public String SelecttickerById2(String id,Model model){

        List<notice> noticeList= noticeservice.selectnotice(id,"","");
        model.addAttribute("show",noticeList);
        return "通知和罚单详情";


    }



}
