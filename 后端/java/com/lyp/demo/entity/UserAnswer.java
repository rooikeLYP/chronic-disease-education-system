package com.lyp.demo.entity;

import java.io.Serializable;

/**
 * (UserAnswer)实体类
 *
 * @author 刘亚鹏
 * @since 2022-05-11 20:10:15
 */
public class UserAnswer implements Serializable {
  private static final long serialVersionUID = 727924927676928942L;

  private Integer 问卷编号;

  private String 用户账号;

  private String 问题编号;

  private String 答案;


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

  public String get问题编号() {
    return 问题编号;
  }

  public void set问题编号(String 问题编号) {
    this.问题编号 = 问题编号;
  }

  public String get答案() {
    return 答案;
  }

  public void set答案(String 答案) {
    this.答案 = 答案;
  }

}
