package com.lyp.demo.controller;

import com.lyp.demo.entity.Introduce;
import com.lyp.demo.service.IntroduceService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * (Introduce)表控制层
 *
 * @author 刘亚鹏
 * @since 2022-04-10 15:07:52
 */
@RestController
@RequestMapping("introduce")
public class IntroduceController {
  /**
   * 服务对象
   */
  @Resource
  private IntroduceService introduceService;

  /**
   * 返回所有的自我介绍
    * @param map
   * @return
   */
  @RequestMapping("/getIntroduce")
  @ResponseBody
  public List<Introduce> selectAllIntroduce(@RequestBody Map map) {
    String id = map.get("account").toString();
    return this.introduceService.selectAllIntroduce(id);
  }

  /**
   * 新增自我介绍
   * @param map
   * @return
   */
  @RequestMapping("/addIntroduce")
  @ResponseBody
  public boolean updateIntroduce(@RequestBody Map map) {
    String account = map.get("account").toString();
    String name = map.get("name").toString();
    String introduce = map.get("introduce").toString();
    String isDefault = map.get("isDefault").toString();
    if(Objects.equals(isDefault, "1")) this.introduceService.updateIsDefault();
    this.introduceService.deleteIntroduce(account);
    return this.introduceService.addIntroduce(name, account, introduce, isDefault);
  }

  /**
   * 删除已有自我介绍
   * @param account
   * @return
   */
  public boolean deleteIntroduce(String account) {
    return this.introduceService.deleteIntroduce(account);
  }

}
