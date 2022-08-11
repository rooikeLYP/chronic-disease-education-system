package com.lyp.demo.dao;

import com.lyp.demo.entity.Questions;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (Questions)表数据库访问层
 *
 * @author 刘亚鹏
 * @since 2022-05-11 20:10:03
 */
public interface QuestionsDao {

  /**
   * 查询所有问题
   * @param qNum
   * @return
   */
 List<Questions> selectAllQuestions(@Param("qNum") String qNum);

}

