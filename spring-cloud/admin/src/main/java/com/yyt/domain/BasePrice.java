package com.yyt.domain;

public class BasePrice {
    private Integer id;
    private Integer room_id;
    private String room_date;
    private Float price;

    @Override
    public String toString() {
        return "BasePrice{" +
                "id=" + id +
                ", room_id=" + room_id +
                ", room_date='" + room_date + '\'' +
                ", price=" + price +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRoom_id() {
        return room_id;
    }

    public void setRoom_id(Integer room_id) {
        this.room_id = room_id;
    }

    public String getRoom_date() {
        return room_date;
    }

    public void setRoom_date(String room_date) {
        this.room_date = room_date;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }
}
