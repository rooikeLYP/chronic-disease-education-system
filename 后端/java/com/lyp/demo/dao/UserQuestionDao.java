package com.lyp.demo.dao;

import com.lyp.demo.entity.UserQuestion;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (UserQuestion)表数据库访问层
 *
 * @author 刘亚鹏
 * @since 2022-05-11 20:10:26
 */
public interface UserQuestionDao {

  /**
   * 查询用户的所有问卷
   * @param account
   * @return
   */
  List<UserQuestion> selectAllUserQ(@Param("account") String account);

  /**
   * 重置用户问卷提交状态
   * @param account
   * @param qNum
   * @return
   */
  boolean updateUserQ(
          @Param("account") String account,
          @Param("qNum") String qNum,
          @Param("status") String status);

  /**
   * 插入用户调查问卷
   * @param qNum
   * @param account
   * @return
   */
  boolean addUserQ(@Param("qNum") String qNum,
                   @Param("account") String account);
}

