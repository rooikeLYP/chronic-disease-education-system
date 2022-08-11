package com.lyp.demo.service.impl;

import com.lyp.demo.entity.UserQuestion;
import com.lyp.demo.dao.UserQuestionDao;
import com.lyp.demo.service.UserQuestionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (UserQuestion)表服务实现类
 *
 * @author 刘亚鹏
 * @since 2022-05-11 20:10:27
 */
@Service("userQuestionService")
public class UserQuestionServiceImpl implements UserQuestionService {
  @Resource
  private UserQuestionDao userQuestionDao;

  /**
   * 查询用户的所有问卷
   * @param account
   * @return
   */
  @Override
  public List<UserQuestion> selectAllUserQ(String account) {
    return this.userQuestionDao.selectAllUserQ(account);
  }

  /**
   * 重置用户问卷提交状态
   * @param account
   * @param qNum
   * @return
   */
  @Override
  public boolean updateUserQ(String account, String qNum, String status) {
    return this.userQuestionDao.updateUserQ(account, qNum, status);
  }

  @Override
  public boolean addUserQ(String qNum, String account) {
    return this.userQuestionDao.addUserQ(qNum, account);
  }
}
