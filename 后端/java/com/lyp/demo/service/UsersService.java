package com.lyp.demo.service;

import com.lyp.demo.entity.Users;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (Users)表服务接口
 *
 * @author 刘亚鹏
 * @since 2022-04-05 10:19:28
 */
public interface UsersService {

  /**
   * 获取用户密码
   * @param account
   * @return
   */
  Users getPassWord(String account);

  /**
   * 修改密码
   * @param account
   * @param newPwd
   * @return
   */
  boolean changePwd(String account, String newPwd);

  /**
   * 修改昵称
   * @param name
   * @param account
   * @return
   */
  boolean changeName(String name, String account);

  /**
   * 修改头像
   * @param account
   * @param picture
   * @return
   */
  boolean changePic(String account, String picture);

  /**
   * 添加新的用户
   * @param account
   * @param pwd
   * @param name
   * @return
   */
  boolean addUser(String account, String pwd, String name);
}
