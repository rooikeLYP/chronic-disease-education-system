package com.lyp.demo.service;

import com.lyp.demo.entity.Clock;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (Clock)表服务接口
 *
 * @author 刘亚鹏
 * @since 2022-04-10 15:07:49
 */
public interface ClockService {

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
  boolean addClock(String id, String name, String startTime, String endTime);


  /**
   * 更新已有吃药打卡
   * @param lastTime
   * @param isClock
   * @return
   */
  boolean updateClock(String lastTime, String isClock, int num);

  /**
   * 删除某条打卡提醒
   * @param num
   * @return
   */
  boolean deleteClock(int num);

}
