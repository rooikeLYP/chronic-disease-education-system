package com.lyp.demo.entity;

import java.io.Serializable;

/**
 * (Questionnaire)实体类
 *
 * @author 刘亚鹏
 * @since 2022-05-11 20:09:02
 */
public class Questionnaire implements Serializable {
  private static final long serialVersionUID = -65706226100417593L;

  private Integer 问卷编号;

  private String 问卷名称;


  public Integer get问卷编号() {
    return 问卷编号;
  }

  public void set问卷编号(Integer 问卷编号) {
    this.问卷编号 = 问卷编号;
  }

  public String get问卷名称() {
    return 问卷名称;
  }

  public void set问卷名称(String 问卷名称) {
    this.问卷名称 = 问卷名称;
  }

}
