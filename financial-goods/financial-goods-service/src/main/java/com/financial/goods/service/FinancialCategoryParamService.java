package com.financial.goods.service;

import com.financial.goods.dao.FinancialCategoryParamMapper;
import com.financial.model.FinancialCategoryParam;
import com.financial.utils.PageRequest;
import com.financial.utils.PageResult;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class FinancialCategoryParamService {
  @Autowired
  FinancialCategoryParamMapper financialCategoryParamMapper;

  public PageResult getList(PageRequest pageRequest) {
    String sqlString = pageRequest.getSql();
    PageHelper.startPage(pageRequest.getCurrentPage(),pageRequest.getPageRows());
    List<FinancialCategoryParam> FinancialCategoryParamList = financialCategoryParamMapper.getList(sqlString);
    PageInfo<FinancialCategoryParam> pageInfo = new PageInfo<FinancialCategoryParam>(FinancialCategoryParamList);
    return new PageResult(pageInfo.getTotal(),pageInfo.getPages(),pageInfo.getList());
  }

  public void add(FinancialCategoryParam financialCategoryParam) {
    if(financialCategoryParam.getIsEdit()) {

    }else{
      financialCategoryParamMapper.insert(financialCategoryParam);
    }
  }
}
