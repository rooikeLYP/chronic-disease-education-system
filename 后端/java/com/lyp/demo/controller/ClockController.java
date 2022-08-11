package com.lyp.demo.controller;

import com.lyp.demo.entity.Clock;
import com.lyp.demo.service.ClockService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * (Clock)表控制层
 *
 * @author 刘亚鹏
 * @since 2022-04-10 15:07:50
 */
@RestController
@RequestMapping("clock")
public class ClockController {
  /**
   * 服务对象
   */
  @Resource
  private ClockService clockService;

  /**
   * 查询用户设置的吃药打卡相关信息
   * @param map
   * @return
   */
  @RequestMapping("/getClocks")
  @ResponseBody
  public List<Clock> selectAllClocks(@RequestBody Map map) {
    String id = map.get("account").toString();
    return this.clockService.selectAllClocks(id);
  }

  /**
   * 新增吃药打卡
   * @param map
   * @return
   */
  @RequestMapping("/addClock")
  @ResponseBody
  public boolean addClock(@RequestBody Map map) {
    String id = map.get("account").toString();
    String name = map.get("name").toString();
    String startTime = map.get("startTime").toString();
    String endTime = map.get("endTime").toString();
    return this.clockService.addClock(id, name, startTime, endTime);
  }

  /**
   * 更新已有吃药打卡
   * @param map
   * @return
   */
  @RequestMapping("/updateClock")
  @ResponseBody
  public boolean updateClock(@RequestBody Map map) {
    String lastTime = "", isClock = "";
    if(map.containsKey("lastTime"))
       lastTime = map.get("lastTime").toString();
    if(map.containsKey("isClock"))
      isClock = map.get("isClock").toString();
    int num = (int) map.get("num");
    return this.clockService.updateClock(lastTime, isClock, num);
  }

  /**
   * 删除某条打卡提醒
   * @param map
   * @return
   */
  @RequestMapping("/deleteClock")
  @ResponseBody
  public boolean deleteClock(@RequestBody Map map) {
    int num = (int) map.get("num");
    return this.clockService.deleteClock(num);
  }
}
