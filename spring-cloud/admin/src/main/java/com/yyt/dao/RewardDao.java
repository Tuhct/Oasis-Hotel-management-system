package com.yyt.dao;

import com.yyt.domain.Reward;
import org.apache.ibatis.annotations.*;

import java.util.List;

// TODO 添加@Mapper
@Mapper
public interface RewardDao {
    @Insert("insert into reward (reward_date,loss_day,loss_all,loss_avg) values(#{reward_date},#{loss_day},#{loss_all},#{loss_avg})")
    public int save(Reward reward);

    @Update("update reward set reward_date = #{reward_date}, loss_day = #{loss_day}, loss_all = #{loss_all} , loss_avg = #{loss_avg} where id = #{id}")
    public int update(Reward reward);

    @Delete("delete from reward where id = #{id}")
    public int delete(Integer id);

    @Select("select * from reward where id = #{id}")
    public Reward getById(Integer id);

    @Select("select * from reward")
    public List<Reward> getAll();
}
