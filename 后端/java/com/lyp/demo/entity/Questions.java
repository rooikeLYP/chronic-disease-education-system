package com.lyp.demo.entity;

import java.io.Serializable;

/**
 * (Questions)实体类
 *
 * @author 刘亚鹏
 * @since 2022-05-11 20:10:03
 */
public class Questions implements Serializable {
  private static final long serialVersionUID = -82044920425747322L;

  private Integer 问题编号;

  private Integer 问卷编号;

  private String 问题;

  private String a;

  private String b;

  private String c;

  private String d;


  public Integer get问题编号() {
    return 问题编号;
  }

  public void set问题编号(Integer 问题编号) {
    this.问题编号 = 问题编号;
  }

  public Integer get问卷编号() {
    return 问卷编号;
  }

  public void set问卷编号(Integer 问卷编号) {
    this.问卷编号 = 问卷编号;
  }

  public String get问题() {
    return 问题;
  }

  public void set问题(String 问题) {
    this.问题 = 问题;
  }

  public String getA() {
    return a;
  }

  public void setA(String a) {
    this.a = a;
  }

  public String getB() {
    return b;
  }

  public void setB(String b) {
    this.b = b;
  }

  public String getC() {
    return c;
  }

  public void setC(String c) {
    this.c = c;
  }

  public String getD() {
    return d;
  }

  public void setD(String d) {
    this.d = d;
  }

}
