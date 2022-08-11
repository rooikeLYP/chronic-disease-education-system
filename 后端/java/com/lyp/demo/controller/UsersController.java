package com.lyp.demo.controller;

import com.lyp.demo.entity.Questionnaire;
import com.lyp.demo.entity.Users;
import com.lyp.demo.service.UsersService;

import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

import java.util.List;
import java.util.Map;

/**
 * (Users)表控制层
 *
 * @author 刘亚鹏
 * @since 2022-04-05 10:19:28
 */
@RestController
@RequestMapping("users")
public class UsersController {
  /**
   * 服务对象
   */
  @Resource
  private UsersService usersService;
  @Resource
  private QuestionnaireController questionnaireController;
  @Resource
  private UserQuestionController userQuestionController;

  /**
   * 如果使用的是post请求，则需要绑定@RequestBody来获取数据
   * @param map
   * @return
   * @throws Exception
   */
  @RequestMapping("/login")
  @ResponseBody
  public String login(@RequestBody Map map) {
    String account = (String) map.get("account");
    String pwd = (String) map.get("pwd");
    if(this.usersService.getPassWord(account) != null) {
      if(pwd.equals(this.usersService.getPassWord(account).get密码())){
        return "密码正确";
      }
      else return "密码错误";
    }
    else return "账号未注册";
  }

//  /**
//   * 登录验证密码
//   * 如果使用的是get请求则正常使用request获取即可
//   * @param res
//   * @return
//   * @throws Exception
//   */
//  @GetMapping("/login")
//  public @ResponseBody boolean login(HttpServletRequest res) throws Exception{
//  String account = res.getParameter("account");
//  String pwd = res.getParameter("pwd");
//  System.out.println(account);
//  System.out.println(pwd);
//  if(pwd.equals(this.usersService.getPassWord(account).get密码())){
////      session.setAttribute("account", account);
////      session.setAttribute("pwd", pwd);
//    return true;
//  }
//  return false;
//}

  @RequestMapping("/getUserData")
  @ResponseBody
  public Users getUserData(@RequestBody Map map) {
    return this.usersService.getPassWord(map.get("account").toString());
  }

  /**
   * 修改密码
   * 根据传入的sessionid从hashmap中获取对应的session
   * 然后从session中获取账号和旧密码
   * @param map
   * @return
   */
  @RequestMapping("/changePwd")
  @ResponseBody
  public boolean changePwd(@RequestBody Map map) {
      String account = map.get("account").toString();
      String oldPwd = map.get("oldPwd").toString();
      String newPwd = map.get("newPwd").toString();
      if(!oldPwd.equals(newPwd)) {
        return this.usersService.changePwd(account, newPwd);
    }
    return false;
  }

  /**
   * 修改用户昵称
   * @param map
   * @return
   */
  @RequestMapping("/changeName")
  @ResponseBody
  public boolean changeName(@RequestBody Map map) {
      String account = map.get("account").toString();
      String newName = map.get("newName").toString();
      return this.usersService.changeName(newName, account);
  }

  /**
   * 修改用户头像
   * @param map
   * @return
   */
  @RequestMapping("/changePic")
  @ResponseBody
  public boolean changPic(@RequestBody Map map) {
      String account = map.get("account").toString();
      String newPicture = map.get("newPicture").toString();
      return this.usersService.changePic(account, newPicture);
  }


  @RequestMapping("/addUser")
  @ResponseBody
  public String addUser(@RequestBody Map map) {
    String account = map.get("account").toString();
    String pwd = map.get("pwd").toString();
    String name = map.get("name").toString();
    List<Questionnaire> questionnaires = questionnaireController.selectAllQuestionnaire();
    if(this.usersService.getPassWord(account) == null) {
      this.usersService.addUser(account, pwd, name);
      for (Questionnaire questionnaire : questionnaires) {
        this.userQuestionController.addUserQ(questionnaire.get问卷编号().toString(), account);
      }
      return "注册成功";
    }
    return "账号已注册";
  }
}
