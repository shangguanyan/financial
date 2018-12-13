package com.financial.goods.dao;

import com.financial.model.FinancialBrandCategory;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface FinancialBrandCategoryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(FinancialBrandCategory record);

    int insertSelective(FinancialBrandCategory record);

    FinancialBrandCategory selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(FinancialBrandCategory record);

    int updateByPrimaryKey(FinancialBrandCategory record);

  void deleteByBrandId(Long brandid);
}
