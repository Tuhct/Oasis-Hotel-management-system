package com.example.springbootdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



@Controller
public class Page_jump {
    @RequestMapping("/gyjm")
    public  String gyjm(){ return "雇员界面"; }

    @RequestMapping("/scfd")
    public  String scfd(){ return "生成罚单"; }

    @RequestMapping("/scdd")
    public  String scdd(){ return "生成订单"; }

    @RequestMapping("/sctz")
    public  String sctz(){ return "生成通知"; }

    @RequestMapping("/mrrz")
    public  String mrrz(){ return "每日入住"; }

    @RequestMapping("/mrdd")
    public  String mrdd(){ return "每日到达"; }

    @RequestMapping("/yhjm")
    public  String yhjm(){ return "用户界面"; }

    @RequestMapping("/wdfd")
    public  String wdfd(){ return "我的罚单"; }

    @RequestMapping("/wddd")
    public  String wddd(){ return "我的订单"; }

    @RequestMapping("/wdtz")
    public  String wdtz(){ return "我的通知"; }

    @RequestMapping("/wxfkm")
    public  String wxfkm(){ return "微信付款码"; }

    @RequestMapping("/zfbfkm")
    public  String zfbfkm(){ return "支付宝付款码"; }


    @RequestMapping("/yuding")
    public  String yuding(){ return "预定"; }

    @RequestMapping("/ckyd")
    public  String ckyd(){ return "查看预定"; }
}
