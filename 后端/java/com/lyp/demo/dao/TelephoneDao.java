package com.lyp.demo.dao;

import com.lyp.demo.entity.Telephone;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (Telephone)表数据库访问层
 *
 * @author 刘亚鹏
 * @since 2022-04-10 15:07:51
 */
@Mapper
public interface TelephoneDao {

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
  boolean addTelephone(@Param("name") String name,
                       @Param("account") String account,
                       @Param("telephone") String telephone,
                       @Param("isDefault") String isDefault);

  /**
   * 更新家属电话
   * @param num
   * @param telephone
   * @return
   */
  boolean updateTelephone(@Param("num") int num,
                          @Param("name") String name,
                          @Param("telephone") String telephone,
                          @Param("isDefault") String isDefault);

  /**
   * 清除目前的默认电话
   * @return
   */
  boolean updateIsDefault(@Param("account") String account);

  /**
   * 删除家属电话
   * @param num
   * @return
   */
  boolean deleteTelephone(@Param("num") int num);
}

