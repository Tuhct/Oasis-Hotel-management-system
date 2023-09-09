package com.example.springbootdemo.controller;


import com.example.springbootdemo.bean.*;
import com.example.springbootdemo.service.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import java.util.Iterator;
import java.util.List;

@Controller
public class gy {

    @Resource       //这个一定要加，这个是注入
    arriveService arr;        //在运行过程中动态创建对象，不需要再静态new

    @RequestMapping(value = "/mrdd",method = RequestMethod.POST)
    public String mrdd(String client_name,String room_id,String arrive_date,String book_type,String depart, String deal,Model model){
        if(deal.equals("增加")){
            arr.addarr(client_name,room_id,arrive_date,book_type,depart);
            model.addAttribute("Result","增加成功");
        }else if(deal.equals("删除")){
            arr.deletearr(client_name,room_id,arrive_date);
            model.addAttribute("Result","删除成功");
        }else if(deal.equals("修改")){
            arr.updatearr(client_name,room_id,arrive_date,book_type,depart);
            model.addAttribute("Result","更新成功");
        }else if(deal.equals("查询")){
            List<arrive> arriveList= arr.selectarr(client_name,room_id,arrive_date,book_type,depart);
            model.addAttribute("Result",
                    "            <tr>\n" +
//                            "                <th>编号</th>\n" +
                            "                <th>客户姓名</th>\n" +
                            "                <th>房间编号</th>\n" +
                            "                <th>到达时间</th>\n" +
                            "                <th>预定类型</th>\n" +
                            "                <th>离开时间</th>\n" +

                            "            </tr>");
            model.addAttribute("arriveList",arriveList);

        }

        return "每日到达";
    }


    @Resource       //这个一定要加，这个是注入
    day_inService day_inS;        //在运行过程中动态创建对象，不需要再静态new

    @RequestMapping(value = "/mrrz",method = RequestMethod.POST)
    public String mrrz(String room_id,String client_name,String depart,String deal,Model model){
        if(deal.equals("增加")){
            day_inS.addday(room_id,client_name,depart);
            model.addAttribute("Result","增加成功");
        }else if(deal.equals("删除")){
            day_inS.deleteday(room_id);
            model.addAttribute("Result","删除成功");
        }else if(deal.equals("修改")){
            day_inS.updateday(room_id,client_name,depart);
            model.addAttribute("Result","更新成功");
        }else if(deal.equals("查询")){
            List<day_in> day_inList= day_inS.selectday(room_id,client_name,depart);
            model.addAttribute("Result",
                    "            <tr>\n" +
//                            "                <th>编号</th>\n" +
                            "                <th>房间编号</th>\n" +
                            "                <th>客户姓名</th>\n" +
                            "                <th>离开时间</th>\n" +
                            "            </tr>");
            model.addAttribute("day_inList",day_inList);

        }

        return "每日入住";
    }

    @Resource       //这个一定要加，这个是注入
    ticketService ticketservice;        //在运行过程中动态创建对象，不需要再静态new
    @RequestMapping(value = "/scfd",method = RequestMethod.POST)
    public String scfd(String id, String c_email, String message,String deal,Model model){

        if(deal.equals("发送")){
            ticketservice.addticket(id,c_email,message);
            model.addAttribute("Result","发送成功");
        }else if(deal.equals("查询")){
            List<ticket> ticketList= ticketservice.selectticket(id,c_email,message);
            model.addAttribute("Result",
                    "            <tr>\n" +
                            "                <th>罚单编号</th>\n" +
                            "                <th>客户邮箱</th>\n" +
                            "                <th>罚单内容</th>\n" +
                            "            </tr>");
            model.addAttribute("ticketList",ticketList);

        }

        return "生成罚单";
    }
//*********************************************************
    @Resource       //这个一定要加，这个是注入
    noticeService noticeservice;        //在运行过程中动态创建对象，不需要再静态new
    @RequestMapping(value = "/sctz",method = RequestMethod.POST)
    public String sctz(String id, String c_email, String message,String deal,Model model){

        if(deal.equals("发送")){
            noticeservice.addnotice(id,c_email,message);
            model.addAttribute("Result","发送成功");
        }else if(deal.equals("查询")){
            List<notice> noticeList= noticeservice.selectnotice(id,c_email,message);
            model.addAttribute("Result",
                    "            <tr>\n" +
                            "                <th>通知编号</th>\n" +
                            "                <th>客户邮箱</th>\n" +
                            "                <th>通知内容</th>\n" +
                            "            </tr>");
            model.addAttribute("noticeList",noticeList);

        }

        return "生成通知";
    }
    //******************************************************************

    @Resource       //这个一定要加，这个是注入
    payService payservice;        //在运行过程中动态创建对象，不需要再静态new

    @RequestMapping(value = "/scdd",method = RequestMethod.POST)
    public String scdd(String id, String c_id, String price, String pay_date,String deal,Model model){
        if(deal.equals("增加")){
            payservice.addpay(id,c_id,price,pay_date);
            model.addAttribute("Result","增加成功");
        }else if(deal.equals("删除")){
            payservice.deletepay(id);
            model.addAttribute("Result","删除成功");
        }else if(deal.equals("修改")){
            payservice.updatepay(id,c_id,price,pay_date);
            model.addAttribute("Result","更新成功");
        }else if(deal.equals("查询")){
            List<pay> payList= payservice.selectpay(id,c_id,price,pay_date);
            model.addAttribute("Result",
                    "            <tr>\n" +
                            "                <th>订单编号</th>\n" +
                            "                <th>客户编号</th>\n" +
                            "                <th>价格</th>\n" +
                            "                <th>支付时间</th>\n" +
                            "            </tr>");
            model.addAttribute("payList",payList);

        }

        return "生成订单";
    }

    @Resource       //这个一定要加，这个是注入
            bookingService bookingservice;        //在运行过程中动态创建对象，不需要再静态new
    @RequestMapping(value = "/ckyd1",method = RequestMethod.POST)
    public String ckyd1(String book_id, String c_id, String book_type,String depart,String occupancy,String price,String deal,Model model){

        if(deal.equals("增加")){
            bookingservice.addbooking(book_id,c_id,book_type,depart,occupancy,price);
            model.addAttribute("Result","增加成功");
        }else if(deal.equals("删除")){
            bookingservice.deletebooking(book_id);
            model.addAttribute("Result","删除成功");
        }else if(deal.equals("修改")){
            bookingservice.updatebooking(book_id,c_id,book_type,depart,occupancy,price);
            model.addAttribute("Result","更新成功");
        }else if(deal.equals("查询")){
            List<booking> bookingList= bookingservice.selectbooking(book_id,c_id,book_type,depart,occupancy,price);
            model.addAttribute("Result",
                    "            <tr>\n" +
                            "                <th>预定编号</th>\n" +
                            "                <th>客户编号</th>\n" +
                            "                <th>预定类型</th>\n" +
                            "                <th>居住时间</th>\n" +
                            "                <th>离开时间</th>\n" +
                            "                <th>价格</th>\n" +
                            "            </tr>");
            model.addAttribute("bookingList",bookingList);

        }

        return "查看预定";
    }

}
