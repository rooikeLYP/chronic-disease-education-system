package com.lyp.demo.service;

import com.lyp.demo.entity.Telephone;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (Telephone)表服务接口
 *
 * @author 刘亚鹏
 * @since 2022-04-10 15:07:51
 */
public interface TelephoneService {

  /**
   * 查询所有的电话信息
   * @param id
   * @return
   */
  List<Telephone> selectAllTelephones(@Param("id") String id);

  /**
   * 添加家属电话
   * @param name
   * @param account
   * @param telephone
   * @param isDefault
   * @return
   */
  boolean addTelephone(String name,
                       String account,
                       String telephone,
                       String isDefault);

  /**
   * 更新家属电话
   * @param num
   * @param telephone
   * @return
   */
  boolean updateTelephone(int num,
                          String name,
                          String telephone,
                          String isDefault);

  /**
   * 删除家属电话
   * @param num
   * @return
   */
  boolean deleteTelephone(int num);

  /**
   * 清除目前的默认电话
   * @return
   */
  boolean updateIsDefault(String account);
}
