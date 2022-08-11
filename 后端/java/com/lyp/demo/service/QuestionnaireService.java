package com.lyp.demo.service;

import com.lyp.demo.entity.Questionnaire;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (Questionnaire)表服务接口
 *
 * @author 刘亚鹏
 * @since 2022-05-11 20:09:04
 */
public interface QuestionnaireService {

  /**
   * 查找所有调查问卷
   * @return
   */
  List<Questionnaire> selectAllQ();
}
