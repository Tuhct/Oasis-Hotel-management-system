package com.yyt.dao;

import com.yyt.domain.ReportRevenue;
import org.apache.ibatis.annotations.*;

import java.util.List;

// TODO 添加@Mapper
@Mapper
public interface ReportRevenueDao {
    @Insert("insert into report_revenue (report_date,revenue_day,revenue_avg,revenue_all) values(#{report_date},#{revenue_day},#{revenue_avg},#{revenue_all})")
    public int save(ReportRevenue reportRevenue);

    @Update("update report_revenue set report_date = #{report_date}, revenue_day = #{revenue_day}, revenue_avg = #{revenue_avg} , revenue_all = #{revenue_all}where id = #{id}")
    public int update(ReportRevenue reportRevenue);

    @Delete("delete from report_revenue where id = #{id}")
    public int delete(Integer id);

    @Select("select * from report_revenue where id = #{id}")
    public ReportRevenue getById(Integer id);

    @Select("select * from report_revenue")
    public List<ReportRevenue> getAll();
}
