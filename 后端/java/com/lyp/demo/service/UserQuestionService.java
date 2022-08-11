package com.lyp.demo.service;

import com.lyp.demo.entity.UserQuestion;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (UserQuestion)表服务接口
 *
 * @author 刘亚鹏
 * @since 2022-05-11 20:10:26
 */
public interface UserQuestionService {

  /**
   * 查询用户的所有问卷
   * @param account
   * @return
   */
  List<UserQuestion> selectAllUserQ(String account);

  /**
   * 重置用户问卷提交状态
   * @param account
   * @param qNum
   * @return
   */
  boolean updateUserQ(String account, String qNum, String status);

  /**
   * 插入用户调查问卷
   * @param qNum
   * @param account
   * @return
   */
  boolean addUserQ(String qNum, String account);
}
