package com.lyp.demo.service.impl;

import com.lyp.demo.entity.Introduce;
import com.lyp.demo.dao.IntroduceDao;
import com.lyp.demo.service.IntroduceService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Introduce)表服务实现类
 *
 * @author 刘亚鹏
 * @since 2022-04-10 15:07:52
 */
@Service("introduceService")
public class IntroduceServiceImpl implements IntroduceService {
  @Resource
  private IntroduceDao introduceDao;

  /**
   * 查询所有自我介绍
   * @param id
   * @return
   */
  @Override
  public List<Introduce> selectAllIntroduce(String id) {
    return this.introduceDao.selectAllIntroduce(id);
  }

  /**
   * 新增自我介绍
   * @param name
   * @param account
   * @param introduce
   * @param isDefault
   * @return
   */
  @Override
  public boolean addIntroduce(String name, String account, String introduce, String isDefault) {
    return this.introduceDao.addIntroduce(name, account, introduce, isDefault);
  }

  @Override
  public boolean updateIsDefault() {
    return this.introduceDao.updateIsDefault();
  }

  /**
   * 删除自我介绍
   * @param account
   * @return
   */
  @Override
  public boolean deleteIntroduce(String account) {
    return this.introduceDao.deleteIntroduce(account);
  }
}
