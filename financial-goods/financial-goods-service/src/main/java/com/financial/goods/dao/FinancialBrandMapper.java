package com.financial.goods.dao;

import com.financial.model.FinancialBrand;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface FinancialBrandMapper{
    int deleteByPrimaryKey(Long id);

    int insert(FinancialBrand record);

    int insertSelective(FinancialBrand record);

    FinancialBrand selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(FinancialBrand record);

    int updateByPrimaryKey(FinancialBrand record);

  List<FinancialBrand> getList(@Param("sql") String sqlString);

  List<FinancialBrand> getAll();

}
