package com.yyt.domain;

public class ReportIn {
    private Integer id;
    private String report_date;
    private String room_type;
    private Integer room_num;
    private String avg_occupancy;

    @Override
    public String toString() {
        return "ReportIn{" +
                "id=" + id +
                ", report_date='" + report_date + '\'' +
                ", room_type='" + room_type + '\'' +
                ", room_num=" + room_num +
                ", avg_occupancy='" + avg_occupancy + '\'' +
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

    public String getRoom_type() {
        return room_type;
    }

    public void setRoom_type(String room_type) {
        this.room_type = room_type;
    }

    public Integer getRoom_num() {
        return room_num;
    }

    public void setRoom_num(Integer room_num) {
        this.room_num = room_num;
    }

    public String getAvg_occupancy() {
        return avg_occupancy;
    }

    public void setAvg_occupancy(String avg_occupancy) {
        this.avg_occupancy = avg_occupancy;
    }
}
