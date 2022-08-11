package com.lyp.demo.service.impl;

import com.lyp.demo.entity.UserAnswer;
import com.lyp.demo.dao.UserAnswerDao;
import com.lyp.demo.service.UserAnswerService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (UserAnswer)表服务实现类
 *
 * @author 刘亚鹏
 * @since 2022-05-11 20:10:16
 */
@Service("userAnswerService")
public class UserAnswerServiceImpl implements UserAnswerService {
  @Resource
  private UserAnswerDao userAnswerDao;

  /**
   * 查询用户问卷的提交答案
   * @param account
   * @param qNum
   * @return
   */
  @Override
  public List<UserAnswer> selectAllUserA(String account, String qNum) {
    return this.userAnswerDao.selectAllUserA(account, qNum);
  }

  /**
   * 保存用户提交的答案
   * @param account
   * @param qNum
   * @param quesNum
   * @param answer
   * @return
   */
  @Override
  public boolean insertUserA(String account, String qNum, String quesNum, String answer) {
    return this.userAnswerDao.insertUserA(account, qNum, quesNum, answer);
  }

  /**
   * 重置用户问卷的答案
   * @param account
   * @param qNum
   * @return
   */
  @Override
  public boolean deleteUserA(String account, String qNum) {
    return this.userAnswerDao.deleteUserA(account, qNum);
  }
}
