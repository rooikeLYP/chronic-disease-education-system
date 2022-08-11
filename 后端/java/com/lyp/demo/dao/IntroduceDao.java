package com.lyp.demo.dao;

import com.lyp.demo.entity.Introduce;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (Introduce)表数据库访问层
 *
 * @author 刘亚鹏
 * @since 2022-04-10 15:07:51
 */
@Mapper
public interface IntroduceDao {

  /**
   * 查询所有自我介绍
   * @param id
   * @return
   */
  List<Introduce> selectAllIntroduce(@Param("id") String id);

  /**
   * 新增自我介绍
   * @param name
   * @param account
   * @param introduce
   * @param isDefault
   * @return
   */
  boolean addIntroduce(@Param("name") String name,
                       @Param("account") String account,
                       @Param("introduce") String introduce,
                       @Param("isDefault") String isDefault);

  /**
   * 清除目前的默认自我介绍
   * @return
   */
  boolean updateIsDefault();

  /**
   * 删除自我介绍
   * @param num
   * @return
   */
  boolean deleteIntroduce(@Param("account") String account);
}

