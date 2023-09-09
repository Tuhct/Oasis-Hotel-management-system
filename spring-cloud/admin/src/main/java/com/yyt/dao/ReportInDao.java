package com.yyt.dao;

import com.yyt.domain.ReportIn;
import com.yyt.domain.ReportRevenue;
import org.apache.ibatis.annotations.*;

import java.util.List;

// TODO 添加@Mapper
@Mapper
public interface ReportInDao {
    @Insert("insert into report_in (report_date,room_type,room_num,avg_occupancy) values(#{report_date},#{room_type},#{room_num},#{avg_occupancy})")
    public int save(ReportIn reportIn);

    @Update("update report_in set report_date = #{report_date}, room_type = #{room_type}, room_num = #{room_num} , avg_occupancy = #{avg_occupancy}  where id = #{id}")
    public int update(ReportIn reportIn);

    @Delete("delete from report_in where id = #{id}")
    public int delete(Integer id);

    @Select("select * from report_in where id = #{id}")
    public ReportIn getById(Integer id);

    @Select("select * from report_in")
    public List<ReportIn> getAll();
}
