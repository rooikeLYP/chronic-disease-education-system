package com.lyp.demo.service;

import com.lyp.demo.entity.Questions;

import java.util.List;

/**
 * (Questions)表服务接口
 *
 * @author 刘亚鹏
 * @since 2022-05-11 20:10:03
 */
public interface QuestionsService {

  /**
   * 查询所有问题
   * @param qNum
   * @return
   */
 List<Questions> selectAllQuestions(String qNum);

}
