package com.lyp.demo.service.impl;

import com.lyp.demo.entity.Telephone;
import com.lyp.demo.dao.TelephoneDao;
import com.lyp.demo.service.TelephoneService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Telephone)表服务实现类
 *
 * @author 刘亚鹏
 * @since 2022-04-10 15:07:51
 */
@Service("telephoneService")
public class TelephoneServiceImpl implements TelephoneService {
  @Resource
  private TelephoneDao telephoneDao;

  /**
   * 查询所有的电话信息
   * @param id
   * @return
   */
  @Override
  public List<Telephone> selectAllTelephones(String id) {
    return this.telephoneDao.selectAllTelephones(id);
  }

  /**
   * 添加家属电话
   * @param name
   * @param account
   * @param telephone
   * @param isDefault
   * @return
   */
  @Override
  public boolean addTelephone(String name, String account, String telephone, String isDefault) {
    return this.telephoneDao.addTelephone(name, account, telephone, isDefault);
  }

  /**
   * 更新家属电话
   * @param num
   * @param telephone
   * @return
   */
  @Override
  public boolean updateTelephone(int num,String name, String telephone, String isDefault) {
    return this.telephoneDao.updateTelephone(num, name, telephone, isDefault);
  }

  /**
   * 删除家属电话
   * @param num
   * @return
   */
  @Override
  public boolean deleteTelephone(int num) {
    return this.telephoneDao.deleteTelephone(num);
  }

  /**
   * 清除目前的默认电话
   * @return
   */
  @Override
  public boolean updateIsDefault(String account) {
    return this.telephoneDao.updateIsDefault(account);
  }
}
