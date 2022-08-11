package com.lyp.demo.dao;

import com.lyp.demo.entity.UserAnswer;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (UserAnswer)表数据库访问层
 *
 * @author 刘亚鹏
 * @since 2022-05-11 20:10:15
 */
public interface UserAnswerDao {

  /**
   * 查询用户问卷的提交答案
   * @param account
   * @param qNum
   * @return
   */
 List<UserAnswer> selectAllUserA(@Param("account") String account, @Param("qNum") String qNum);

  /**
   * 保存用户提交的答案
   * @param account
   * @param qNum
   * @param quesNum
   * @param answer
   * @return
   */
 boolean insertUserA(@Param("account") String account,
                     @Param("qNum") String qNum,
                     @Param("quesNum") String quesNum,
                     @Param("answer") String answer);

  /**
   * 重置用户问卷的答案
   * @param account
   * @param qNum
   * @return
   */
 boolean deleteUserA(@Param("account") String account,
                     @Param("qNum") String qNum);
}

