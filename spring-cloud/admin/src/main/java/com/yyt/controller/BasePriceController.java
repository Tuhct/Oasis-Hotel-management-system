package com.yyt.controller;

import com.yyt.domain.BasePrice;
import com.yyt.domain.ReportRevenue;
import com.yyt.service.BasePriceService;
import com.yyt.service.ReportRevenueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/basePrice")
public class BasePriceController {
    @Autowired
    private BasePriceService basePriceService;

    @PostMapping
    public Result save(@RequestBody BasePrice basePrice) {
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
        boolean flag = basePriceService.save(basePrice);
        return new Result(flag ? Code.SAVE_OK : Code.SAVE_ERR, flag);
    }

    @PutMapping
    public Result update(@RequestBody BasePrice basePrice) {
        boolean flag = basePriceService.update(basePrice);
        return new Result(flag ? Code.UPDATE_OK : Code.UPDATE_ERR, flag);
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        boolean flag = basePriceService.delete(id);
        return new Result(flag ? Code.DELETE_OK : Code.DELETE_ERR, flag);
    }

    @GetMapping("/{id}")
    public Result getById(@PathVariable Integer id) {
        BasePrice basePrice = basePriceService.getById(id);
        Integer code = basePrice != null ? Code.GET_OK : Code.GET_ERR;
        String msg = basePrice != null ? "" : "数据查询失败，请重试！";
        return new Result(code, basePrice, msg);
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

        List<BasePrice> basePriceList = basePriceService.getAll();
        Integer code = basePriceList != null ? Code.GET_OK : Code.GET_ERR;
        String msg = basePriceList != null ? "" : "数据查询失败，请重试！";
        return new Result(code, basePriceList, msg);
    }
}
