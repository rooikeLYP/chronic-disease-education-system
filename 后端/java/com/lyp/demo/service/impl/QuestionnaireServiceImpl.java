package com.lyp.demo.service.impl;

import com.lyp.demo.entity.Questionnaire;
import com.lyp.demo.dao.QuestionnaireDao;
import com.lyp.demo.service.QuestionnaireService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Questionnaire)表服务实现类
 *
 * @author 刘亚鹏
 * @since 2022-05-11 20:09:04
 */
@Service("questionnaireService")
public class QuestionnaireServiceImpl implements QuestionnaireService {
  @Resource
  private QuestionnaireDao questionnaireDao;

  /**
   * 查找所有调查问卷
   * @return
   */
  @Override
  public List<Questionnaire> selectAllQ() {
    return this.questionnaireDao.selectAllQ();
  }

}
