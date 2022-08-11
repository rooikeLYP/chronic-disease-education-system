package com.lyp.demo.controller;

import com.lyp.demo.entity.Questionnaire;
import com.lyp.demo.entity.Questions;
import com.lyp.demo.service.QuestionsService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * (Questions)表控制层
 *
 * @author 刘亚鹏
 * @since 2022-05-11 20:10:03
 */
@RestController
@RequestMapping("questions")
public class QuestionsController {
  /**
   * 服务对象
   */
  @Resource
  private QuestionsService questionsService;

  @RequestMapping("/getQuestions")
  @ResponseBody
  public List<Questions> selectAllQuestions(@RequestBody Map map) {
    String qNum = map.get("qNum").toString();
    return this.questionsService.selectAllQuestions(qNum);
  }
}
