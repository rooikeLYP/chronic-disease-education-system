package com.lyp.demo.controller;

import com.lyp.demo.entity.UserAnswer;
import com.lyp.demo.service.UserAnswerService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * (UserAnswer)表控制层
 *
 * @author 刘亚鹏
 * @since 2022-05-11 20:10:16
 */
@RestController
@RequestMapping("userAnswer")
public class UserAnswerController {
  /**
   * 服务对象
   */
  @Resource
  private UserAnswerService userAnswerService;
  @Resource
  private UserQuestionController userQuestionController;

  @RequestMapping("/getUserA")
  @ResponseBody
  public List<UserAnswer> selectAllUserA(@RequestBody Map map) {
    String account = map.get("account").toString();
    String qNUm = map.get("qNum").toString();
    return this.userAnswerService.selectAllUserA(account, qNUm);
  }

  @RequestMapping("/insertUserA")
  @ResponseBody
  public boolean insertUserA(@RequestBody Map map) {
    String account = map.get("account").toString();
    String qNum = map.get("qNum").toString();
    ArrayList<String> quesNum = (ArrayList<String>) map.get("quesNum");
    ArrayList<String> answer = (ArrayList<String>) map.get("answer");
    boolean flag = true;
    for (int i = 0;i<quesNum.size();i++) {
      if(!this.userAnswerService.insertUserA(account, qNum, quesNum.get(i), answer.get(i)))
        flag = false;
    }
    if(!userQuestionController.updateUserQ(account, qNum, "是")) flag = false;
    return flag;
  }

  @RequestMapping("/deleteUserA")
  @ResponseBody
  public boolean deleteUserA(@RequestBody Map map) {
    String account = map.get("account").toString();
    String qNum = map.get("qNum").toString();
    boolean flag = true;
    if(!userQuestionController.updateUserQ(account, qNum, "否")) flag = false;
    if(!this.userAnswerService.deleteUserA(account, qNum)) flag = false;
    return flag;
  }
}
