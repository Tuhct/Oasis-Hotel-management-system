package com.yyt.dao;

import com.yyt.domain.BasePrice;
import com.yyt.domain.ReportRevenue;
import org.apache.ibatis.annotations.*;

import java.util.List;

// TODO 添加@Mapper
@Mapper
public interface BasePriceDao {
    @Insert("insert into base_price (room_id,room_date,price) values(#{room_id},#{room_date},#{price})")
    public int save(BasePrice basePrice);

    @Update("update base_price set room_id = #{room_id}, room_date = #{room_date}, price = #{price} where id = #{id}")
    public int update(BasePrice basePrice);

    @Delete("delete from base_price where id = #{id}")
    public int delete(Integer id);

    @Select("select * from base_price where id = #{id}")
    public BasePrice getById(Integer id);

    @Select("select * from base_price")
    public List<BasePrice> getAll();
}
