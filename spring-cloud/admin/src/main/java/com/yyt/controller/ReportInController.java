package com.yyt.controller;

import com.yyt.domain.ReportIn;
import com.yyt.domain.ReportRevenue;
import com.yyt.service.ReportInService;
import com.yyt.service.ReportRevenueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reportIn")
public class ReportInController {
    @Autowired
    private ReportInService reportInService;

    @PostMapping
    public Result save(@RequestBody ReportIn reportIn) {
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
        boolean flag = reportInService.save(reportIn);
        return new Result(flag ? Code.SAVE_OK : Code.SAVE_ERR, flag);
    }

    @PutMapping
    public Result update(@RequestBody ReportIn reportIn) {
        boolean flag = reportInService.update(reportIn);
        return new Result(flag ? Code.UPDATE_OK : Code.UPDATE_ERR, flag);
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        boolean flag = reportInService.delete(id);
        return new Result(flag ? Code.DELETE_OK : Code.DELETE_ERR, flag);
    }

    @GetMapping("/{id}")
    public Result getById(@PathVariable Integer id) {
        ReportIn reportIn = reportInService.getById(id);
        Integer code = reportIn != null ? Code.GET_OK : Code.GET_ERR;
        String msg = reportIn != null ? "" : "数据查询失败，请重试！";
        return new Result(code, reportIn, msg);
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

        List<ReportIn> reportInList = reportInService.getAll();
        Integer code = reportInList != null ? Code.GET_OK : Code.GET_ERR;
        String msg = reportInList != null ? "" : "数据查询失败，请重试！";
        return new Result(code, reportInList, msg);
    }
}
