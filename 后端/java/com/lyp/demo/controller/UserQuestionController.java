package com.lyp.demo.controller;

import com.lyp.demo.entity.UserQuestion;
import com.lyp.demo.service.UserQuestionService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.jws.soap.SOAPBinding;
import java.util.List;
import java.util.Map;

/**
 * (UserQuestion)表控制层
 *
 * @author 刘亚鹏
 * @since 2022-05-11 20:10:27
 */
@RestController
@RequestMapping("userQuestion")
public class UserQuestionController {
  /**
   * 服务对象
   */
  @Resource
  private UserQuestionService userQuestionService;

  @RequestMapping("/getUserQ")
  @ResponseBody
  public List<UserQuestion> selectAllUserQ(@RequestBody Map map) {
    String account = map.get("account").toString();
    return this.userQuestionService.selectAllUserQ(account);
  }

  public boolean updateUserQ(String account, String qNum, String status) {
    return this.userQuestionService.updateUserQ(account, qNum, status);
  }

  public boolean addUserQ(String qNum, String account) {
    return this.userQuestionService.addUserQ(qNum, account);
  }

}
