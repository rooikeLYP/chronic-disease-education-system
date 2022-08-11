package com.lyp.demo.service;

import com.lyp.demo.entity.Introduce;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (Introduce)表服务接口
 *
 * @author 刘亚鹏
 * @since 2022-04-10 15:07:51
 */
public interface IntroduceService {

  /**
   * 查询所有自我介绍
   * @param id
   * @return
   */
  List<Introduce> selectAllIntroduce(String id);

  /**
   * 新增自我介绍
   * @param name
   * @param account
   * @param introduce
   * @param isDefault
   * @return
   */
  boolean addIntroduce(String name,
                       String account,
                       String introduce,
                       String isDefault);

  /**
   * 清除目前的默认自我介绍
   * @return
   */
  boolean updateIsDefault();

  /**
   * 删除自我介绍
   * @param account
   * @return
   */
  boolean deleteIntroduce(String account);
}
