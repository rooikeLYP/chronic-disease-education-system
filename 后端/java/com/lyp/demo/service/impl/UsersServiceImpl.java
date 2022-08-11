package com.lyp.demo.service.impl;

import com.lyp.demo.entity.Users;
import com.lyp.demo.dao.UsersDao;
import com.lyp.demo.service.UsersService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Users)表服务实现类
 *
 * @author 刘亚鹏
 * @since 2022-04-05 10:19:28
 */
@Service("usersService")
public class UsersServiceImpl implements UsersService {
  @Resource
  private UsersDao usersDao;

  /**
   * 获取用户密码
   * @param account
   * @return
   */
  @Override
  public Users getPassWord(String account) {
    return this.usersDao.getPassWord(account);
  }

  /**
   * 修改密码
   * @param account
   * @param newPwd
   * @return
   */
  @Override
  public boolean changePwd(String account, String newPwd) {
    return this.usersDao.changePwd(account, newPwd);
  }

  /**
   * 修改昵称
   * @param name
   * @param account
   * @return
   */
  @Override
  public boolean changeName(String name, String account) {
    return this.usersDao.changeName(name, account);
  }

  /**
   * 修改头像
   * @param account
   * @param picture
   * @return
   */
  @Override
  public boolean changePic(String account, String picture) {
    return this.usersDao.changePic(account,picture);
  }

  @Override
  public boolean addUser(String account, String pwd, String name) {
    return this.usersDao.addUser(account, pwd, name);
  }
}
