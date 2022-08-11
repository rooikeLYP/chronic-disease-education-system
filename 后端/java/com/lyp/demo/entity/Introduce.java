package com.lyp.demo.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * (Introduce)实体类
 *
 * @author 刘亚鹏
 * @since 2022-04-10 15:07:51
 */
@Data
public class Introduce implements Serializable {
  private static final long serialVersionUID = 212632003601222467L;

  private Integer 自我介绍编号;

  private String 账号;

  private String 自我介绍;

  private String 是否默认;

  private String 名称;
}
