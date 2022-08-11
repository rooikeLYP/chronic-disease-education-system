package com.lyp.demo.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * (Users)实体类
 *
 * @author 刘亚鹏
 * @since 2022-04-05 10:19:28
 */
@Data
public class Users implements Serializable {
  private static final long serialVersionUID = 743775789618749456L;

  private String 账号;

  private String 密码;

  private String 头像;

  private String 昵称;


}
