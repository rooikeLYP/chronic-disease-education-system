package com.lyp.demo.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * (Telephone)实体类
 *
 * @author 刘亚鹏
 * @since 2022-04-10 15:07:50
 */
@Data
public class Telephone implements Serializable {
  private static final long serialVersionUID = 324375897513426931L;

  private Integer 家属编号;

  private String 账号;

  private String 家属电话;

  private String 是否默认;

  private String 名称;

}
