package com.financial.goods.service;

import com.financial.goods.dao.FinancialCategoryMapper;
import com.financial.model.FinancialCategory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FinancialCategoryService {
  @Autowired
  FinancialCategoryMapper financialCategoryMapper;

  public List<FinancialCategory> queryListByParentId(Long pid) {
    return financialCategoryMapper.queryListByParentId(pid);
  }

  public FinancialCategory selectByPrimaryKey(Integer id) {
    return financialCategoryMapper.selectByPrimaryKey(id);
  }
}
