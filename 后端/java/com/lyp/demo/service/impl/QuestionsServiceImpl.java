package com.lyp.demo.service.impl;

import com.lyp.demo.entity.Questions;
import com.lyp.demo.dao.QuestionsDao;
import com.lyp.demo.service.QuestionsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Questions)表服务实现类
 *
 * @author 刘亚鹏
 * @since 2022-05-11 20:10:03
 */
@Service("questionsService")
public class QuestionsServiceImpl implements QuestionsService {
  @Resource
  private QuestionsDao questionsDao;

  /**
   * 查询所有问题
   * @param qNum
   * @return
   */
  @Override
  public List<Questions> selectAllQuestions(String qNum) {
    return this.questionsDao.selectAllQuestions(qNum);
  }
}
