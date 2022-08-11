package com.lyp.demo.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * (Clock)实体类
 *
 * @author 刘亚鹏
 * @since 2022-04-10 15:07:48
 */
@Data
public class Clock implements Serializable {
  private static final long serialVersionUID = -30389778088870879L;

  private Integer 打卡编号;

  private String 账号;

  private String 开始时间;

  private String 结束时间;

  private String 名称;

  private String 上次打卡时间;

  private String 是否打卡;

}
