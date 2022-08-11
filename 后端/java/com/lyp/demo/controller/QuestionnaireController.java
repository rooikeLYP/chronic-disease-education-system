package com.lyp.demo.controller;

import com.lyp.demo.entity.Questionnaire;
import com.lyp.demo.service.QuestionnaireService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Questionnaire)表控制层
 *
 * @author 刘亚鹏
 * @since 2022-05-11 20:09:04
 */
@RestController
@RequestMapping("questionnaire")
public class QuestionnaireController {
  /**
   * 服务对象
   */
  @Resource
  private QuestionnaireService questionnaireService;

  @RequestMapping("/getQuestionnaire")
  @ResponseBody
  public List<Questionnaire> selectAllQuestionnaire() {
    return this.questionnaireService.selectAllQ();
  }
}
