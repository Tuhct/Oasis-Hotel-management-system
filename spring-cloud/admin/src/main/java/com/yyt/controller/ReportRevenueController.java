package com.yyt.controller;

import com.yyt.domain.ReportRevenue;
import com.yyt.service.ReportRevenueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reportRevenue")
public class ReportRevenueController {
    @Autowired
    private ReportRevenueService reportRevenueService;

    @PostMapping
    public Result save(@RequestBody ReportRevenue reportRevenue) {
//        String act = "";
//        Cookie[] cookies = request.getCookies();
//        for (Cookie cookie : cookies) {
//            act = cookie.getName();
//            if (act.equals("account")) {
//                act = cookie.getValue();
//                System.out.println(act);
//                break;
//            }
//        }
//        market.setMarket_owner(act);
        boolean flag = reportRevenueService.save(reportRevenue);
        return new Result(flag ? Code.SAVE_OK : Code.SAVE_ERR, flag);
    }

    @PutMapping
    public Result update(@RequestBody ReportRevenue reportRevenue) {
        boolean flag = reportRevenueService.update(reportRevenue);
        return new Result(flag ? Code.UPDATE_OK : Code.UPDATE_ERR, flag);
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        boolean flag = reportRevenueService.delete(id);
        return new Result(flag ? Code.DELETE_OK : Code.DELETE_ERR, flag);
    }

    @GetMapping("/{id}")
    public Result getById(@PathVariable Integer id) {
        ReportRevenue reportRevenue = reportRevenueService.getById(id);
        Integer code = reportRevenue != null ? Code.GET_OK : Code.GET_ERR;
        String msg = reportRevenue != null ? "" : "数据查询失败，请重试！";
        return new Result(code, reportRevenue, msg);
    }

//    @GetMapping("/cookie/{id}")
//    public void cookieData(HttpServletResponse response, @PathVariable String id) {
//        Cookie cookie = new Cookie("market_ID",id);
//        cookie.setPath("/");
//        response.addCookie(cookie);
//    }

    @GetMapping
    public Result getAll() {
//        String act = "";
//
//        Cookie[] cookies = request.getCookies();
//        for (Cookie cookie : cookies) {
//            act = cookie.getName();
//            if (act.equals("account")) {
//                act = cookie.getValue();
//                System.out.println(act);
//                break;
//            }
//        }

        List<ReportRevenue> reportRevenues = reportRevenueService.getAll();
        Integer code = reportRevenues != null ? Code.GET_OK : Code.GET_ERR;
        String msg = reportRevenues != null ? "" : "数据查询失败，请重试！";
        return new Result(code, reportRevenues, msg);
    }
}
