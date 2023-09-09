package com.yyt.domain;

public class Reward {
    private Integer id;
    private String reward_date;
    private String loss_day;
    private String loss_all;
    private String loss_avg;

    @Override
    public String toString() {
        return "Reword{" +
                "id=" + id +
                ", reward_date='" + reward_date + '\'' +
                ", loss_day='" + loss_day + '\'' +
                ", loss_all='" + loss_all + '\'' +
                ", loss_avg='" + loss_avg + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getReward_date() {
        return reward_date;
    }

    public void setReward_date(String reward_date) {
        this.reward_date = reward_date;
    }

    public String getLoss_day() {
        return loss_day;
    }

    public void setLoss_day(String loss_day) {
        this.loss_day = loss_day;
    }

    public String getLoss_all() {
        return loss_all;
    }

    public void setLoss_all(String loss_all) {
        this.loss_all = loss_all;
    }

    public String getLoss_avg() {
        return loss_avg;
    }

    public void setLoss_avg(String loss_avg) {
        this.loss_avg = loss_avg;
    }
}
