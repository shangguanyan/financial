package com.financial.goods.service;

import com.financial.goods.dao.FinancialCategoryMapper;
import com.financial.goods.dao.FinancialSpuMapper;
import com.financial.goods.vo.FinancailSpuVo;
import com.financial.model.FinancialCategory;
import com.financial.utils.PageRequest;
import com.financial.utils.PageResult;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FinancialSpuService {
  @Autowired
  FinancialSpuMapper financialSpuMapper;
  @Autowired
  FinancialCategoryMapper financialCategoryMapper;

  public PageResult getList(PageRequest pageRequest) {
    String sqlString = pageRequest.getSql();
    PageHelper.startPage(pageRequest.getCurrentPage(),pageRequest.getPageRows());
    List<FinancailSpuVo> financailSpuVos = financialSpuMapper.getList(sqlString);
    //设置 分类名称
    financailSpuVos.forEach(spuvo->{
        spuvo.setCategoryName(categoryName(spuvo.getCategoryId(),new ArrayList<>()));
    });
    PageInfo<FinancailSpuVo> pageInfo = new PageInfo<FinancailSpuVo>(financailSpuVos);
    return new PageResult(pageInfo.getTotal(),pageInfo.getPages(),pageInfo.getList());
  }

  public String categoryName(Integer id,List<String> names){
    FinancialCategory financialCategory = financialCategoryMapper.selectByPrimaryKey(id);
    if(financialCategory.getParentId() != 0){
      categoryName(financialCategory.getParentId(),names);
    }
    names.add(financialCategory.getName());
    return StringUtils.join(names, "/");
  }
}
