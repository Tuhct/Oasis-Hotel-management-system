package com.yyt.domain;

public class ReportRevenue {
    private Integer id;
    private String report_date;
    private String revenue_day;
    private String revenue_avg;
    private String revenue_all;

    @Override
    public String toString() {
        return "ReportRevenue{" +
                "id=" + id +
                ", report_date='" + report_date + '\'' +
                ", revenue_day='" + revenue_day + '\'' +
                ", revenue_avg='" + revenue_avg + '\'' +
                ", revenue_all='" + revenue_all + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getReport_date() {
        return report_date;
    }

    public void setReport_date(String report_date) {
        this.report_date = report_date;
    }

    public String getRevenue_day() {
        return revenue_day;
    }

    public void setRevenue_day(String revenue_day) {
        this.revenue_day = revenue_day;
    }

    public String getRevenue_avg() {
        return revenue_avg;
    }

    public void setRevenue_avg(String revenue_avg) {
        this.revenue_avg = revenue_avg;
    }

    public String getRevenue_all() {
        return revenue_all;
    }

    public void setRevenue_all(String revenue_all) {
        this.revenue_all = revenue_all;
    }
}
