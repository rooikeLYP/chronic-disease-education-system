package com.lyp.demo.dao;

import com.lyp.demo.entity.Users;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (Users)表数据库访问层
 *
 * @author 刘亚鹏
 * @since 2022-04-05 10:19:28
 */
@Mapper
public interface UsersDao {

  /**
   * 获取用户密码
   * @param account
   * @return
   */
  Users getPassWord(@Param("account") String account);


  /**
   * 修改密码
   * @param account
   * @param newPwd
   * @return
   */
  boolean changePwd(@Param("account") String account, @Param("newPwd") String newPwd);

  /**
   * 修改昵称
   * @param name
   * @param account
   * @return
   */
  boolean changeName(@Param("name") String name, @Param("account") String account);

  /**
   * 修改头像
   * @param account
   * @param picture
   * @return
   */
  boolean changePic(@Param("account") String account, @Param("picture") String picture);

  /**
   * 添加新的用户
   * @param account
   * @param pwd
   * @param name
   * @return
   */
  boolean addUser(@Param("account") String account, @Param("pwd") String pwd, @Param("name") String name);
}

