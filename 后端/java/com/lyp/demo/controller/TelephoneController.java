package com.lyp.demo.controller;

import com.lyp.demo.entity.Telephone;
import com.lyp.demo.service.TelephoneService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.lang.reflect.Array;
import java.util.*;

/**
 * (Telephone)表控制层
 *
 * @author 刘亚鹏
 * @since 2022-04-10 15:07:51
 */
@RestController
@RequestMapping("telephone")
public class TelephoneController {
  /**
   * 服务对象
   */
  @Resource
  private TelephoneService telephoneService;

  /**
   * 查询所有的电话信息
   * @param map
   * @return
   */
  @RequestMapping("/getTelephone")
  @ResponseBody
  public List<Telephone> selectAllTelephones(@RequestBody Map map) {
    String id = map.get("account").toString();
    return telephoneService.selectAllTelephones(id);
  }

  /**
   * 添加新的家属电话
   * @param map
   * @return
   */
  @RequestMapping("/addTelephone")
  @ResponseBody
  public boolean addTelephone(@RequestBody Map map) {
    String account = map.get("account").toString();
    String name = map.get("name").toString();
    String telephone = map.get("telephone").toString();
    boolean isDefault = (boolean) map.get("isDefault");
    String Default = "";
    if(isDefault){
      telephoneService.updateIsDefault(account);
      Default = "1";
    }
    return this.telephoneService.addTelephone(name, account, telephone, Default);
  }

  /**
   * 修改已有家属电话
   * @param map
   * @return
   */
  @RequestMapping("/updateTelephone")
  @ResponseBody
  public boolean updateTelephone(@RequestBody Map map) {
    int num = (int) map.get("num");
    String account = map.get("account").toString();
    String name = map.get("name").toString();
    String telephone = map.get( "telephone").toString();
    boolean isDefault = (boolean) map.get("isDefault");
    String Default = "";
    if(isDefault) {
      telephoneService.updateIsDefault(account);
      Default = "1";
    }
    return this.telephoneService.updateTelephone(num, name, telephone, Default);
  }

  /**
   * 删除某个家属电话
   * @param map
   * @return
   */
  @RequestMapping("/deleteTelephone")
  @ResponseBody
  public boolean deleteTelephone(@RequestBody Map map) {
    int num = (int) map.get("num");
    return this.telephoneService.deleteTelephone(num);
  }
}
