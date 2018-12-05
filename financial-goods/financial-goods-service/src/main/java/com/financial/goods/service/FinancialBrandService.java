package com.financial.goods.service;

import com.financial.goods.dao.FinancialBrandMapper;
import com.financial.model.FinancialBrand;
import com.financial.utils.PageRequest;
import com.financial.utils.PageResult;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class FinancialBrandService {
  @Autowired
  FinancialBrandMapper financialBrandMapper;

  public PageResult getList(PageRequest pageRequest) {
    StringBuffer sqlString = new StringBuffer("where 1=1 ");
    if(pageRequest.getSearchKeys() != null){
      Map searchkeys = pageRequest.getSearchKeys();
      searchkeys.keySet().forEach(key ->{
        if(!(searchkeys.get(key) == "" || searchkeys.get(key) == null)){
          sqlString.append(" and ").append(key).append(" like '%").append(searchkeys.get(key)).append("%'");
        }
      });
      if(pageRequest.getSortBy() !=null){
        sqlString.append(" order by " + pageRequest.getSortBy());
      }else{
        sqlString.append(" order by id ");
      }
      if(!pageRequest.getAsc()){
        sqlString.append(" desc");
      }
    }
    PageHelper.startPage(pageRequest.getCurrentPage(),pageRequest.getPageRows());
    List<FinancialBrand> financialBrandList = financialBrandMapper.getList(sqlString.toString());
    PageInfo<FinancialBrand> pageInfo = new PageInfo<FinancialBrand>(financialBrandList);
    return new PageResult(pageInfo.getTotal(),pageInfo.getPages(),pageInfo.getList());
  }

  public void delete(Long id) {
    financialBrandMapper.deleteByPrimaryKey(id);
  }
}
