package com.lyp.demo.service.impl;

import com.lyp.demo.entity.Clock;
import com.lyp.demo.service.ClockService;
import org.springframework.stereotype.Service;
import com.lyp.demo.dao.ClockDao;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Clock)表服务实现类
 *
 * @author 刘亚鹏
 * @since 2022-04-10 15:07:50
 */
@Service("clockService")
public class ClockServiceImpl implements ClockService {
  @Resource
  private ClockDao clockDao;

  /**
   * 查询用户设置的吃药打卡相关信息
   * @param id
   * @return
   */
  @Override
  public List<Clock> selectAllClocks(String id) {
    return this.clockDao.selectAllClocks(id);
  }


  /**
   * 新增吃药打卡
   * @param id
   * @param name
   * @param startTime
   * @param endTime
   * @return
   */
  @Override
  public boolean addClock(String id, String name, String startTime, String endTime) {
    return this.clockDao.addClock(id, name, startTime, endTime);
  }

  /**
   * 更新已有吃药打卡
   * @param lastTime
   * @param isClock
   * @return
   */
  @Override
  public boolean updateClock(String lastTime, String isClock, int num) {
    return this.clockDao.updateClock(lastTime, isClock, num);
  }

  /**
   * 删除某条打卡提醒
   * @param num
   * @return
   */
  @Override
  public boolean deleteClock(int num) {
    return this.clockDao.deleteClock(num);
  }
}
