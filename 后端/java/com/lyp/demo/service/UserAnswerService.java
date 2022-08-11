package com.lyp.demo.service;

import com.lyp.demo.entity.UserAnswer;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (UserAnswer)表服务接口
 *
 * @author 刘亚鹏
 * @since 2022-05-11 20:10:16
 */
public interface UserAnswerService {

  /**
   * 查询用户问卷的提交答案
   * @param account
   * @param qNum
   * @return
   */
  List<UserAnswer> selectAllUserA(String account, String qNum);

  /**
   * 保存用户提交的答案
   * @param account
   * @param qNum
   * @param quesNum
   * @param answer
   * @return
   */
  boolean insertUserA(String account,
                      String qNum,
                      String quesNum,
                      String answer);

  /**
   * 重置用户问卷的答案
   * @param account
   * @param qNum
   * @return
   */
  boolean deleteUserA(String account,
                      String qNum);
}
