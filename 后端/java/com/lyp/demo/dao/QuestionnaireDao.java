package com.lyp.demo.dao;

import com.lyp.demo.entity.Questionnaire;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (Questionnaire)表数据库访问层
 *
 * @author 刘亚鹏
 * @since 2022-05-11 20:09:03
 */
public interface QuestionnaireDao {

  /**
   * 查找所有调查问卷
   * @return
   */
  List<Questionnaire> selectAllQ();


}

