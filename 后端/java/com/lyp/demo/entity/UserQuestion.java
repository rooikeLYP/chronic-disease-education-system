package com.lyp.demo.entity;

import java.io.Serializable;

/**
 * (UserQuestion)实体类
 *
 * @author 刘亚鹏
 * @since 2022-05-11 20:10:26
 */
public class UserQuestion implements Serializable {
  private static final long serialVersionUID = -24121137145136436L;

  private Integer 问卷编号;

  private String 用户账号;

  private String 是否提交;


  public Integer get问卷编号() {
    return 问卷编号;
  }

  public void set问卷编号(Integer 问卷编号) {
    this.问卷编号 = 问卷编号;
  }

  public String get用户账号() {
    return 用户账号;
  }

  public void set用户账号(String 用户账号) {
    this.用户账号 = 用户账号;
  }

  public String get是否提交() {
    return 是否提交;
  }

  public void set是否提交(String 是否提交) {
    this.是否提交 = 是否提交;
  }

}
