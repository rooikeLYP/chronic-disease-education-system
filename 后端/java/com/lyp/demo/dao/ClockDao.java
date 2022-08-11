package com.lyp.demo.dao;

import com.lyp.demo.entity.Clock;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (Clock)表数据库访问层
 *
 * @author 刘亚鹏
 * @since 2022-04-10 15:07:49
 */
@Mapper
public interface ClockDao {

  /**
   * 查询用户设置的吃药打卡相关信息
   * @param id
   * @return
   */
  List<Clock> selectAllClocks(@Param("id") String id);


  /**
   * 新增吃药打卡
   * @param id
   * @param name
   * @param startTime
   * @param endTime
   * @return
   */
  boolean addClock(@Param("id") String id,
                   @Param("name") String name,
                   @Param("startTime") String startTime,
                   @Param("endTime") String endTime);

  /**
   * @param lastTime
   * @param isClock
   * @return
   */
  boolean updateClock(@Param("lastTime") String lastTime,
                      @Param("isClock") String isClock,
                      @Param("num") int num);

  /**
   * 删除某条打卡提醒
   * @param num
   * @return
   */
  boolean deleteClock(@Param("num") int num);

}

