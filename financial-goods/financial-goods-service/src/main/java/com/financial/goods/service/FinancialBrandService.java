package com.financial.goods.service;

import com.financial.goods.dao.FinancialBrandMapper;
import com.financial.utils.PageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FinancialBrandService {
  @Autowired
  FinancialBrandMapper financialBrandMapper;

  public PageResult getList() {
    return null;
  }
}
