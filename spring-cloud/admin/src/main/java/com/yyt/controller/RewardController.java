package com.yyt.controller;

import com.yyt.domain.ReportRevenue;
import com.yyt.domain.Reward;
import com.yyt.service.ReportRevenueService;
import com.yyt.service.RewardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reward")
public class RewardController {
    @Autowired
    private RewardService rewardService;

    @PostMapping
    public Result save(@RequestBody Reward reward) {
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
        boolean flag = rewardService.save(reward);
        return new Result(flag ? Code.SAVE_OK : Code.SAVE_ERR, flag);
    }

    @PutMapping
    public Result update(@RequestBody Reward reward) {
        boolean flag = rewardService.update(reward);
        return new Result(flag ? Code.UPDATE_OK : Code.UPDATE_ERR, flag);
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        boolean flag = rewardService.delete(id);
        return new Result(flag ? Code.DELETE_OK : Code.DELETE_ERR, flag);
    }

    @GetMapping("/{id}")
    public Result getById(@PathVariable Integer id) {
       Reward reward = rewardService.getById(id);
        Integer code = reward != null ? Code.GET_OK : Code.GET_ERR;
        String msg = reward != null ? "" : "数据查询失败，请重试！";
        return new Result(code, reward, msg);
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

        List<Reward> rewardList = rewardService.getAll();
        Integer code = rewardList != null ? Code.GET_OK : Code.GET_ERR;
        String msg = rewardList != null ? "" : "数据查询失败，请重试！";
        return new Result(code, rewardList, msg);
    }
}
