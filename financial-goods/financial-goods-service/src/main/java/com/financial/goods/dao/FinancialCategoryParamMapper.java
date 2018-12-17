package com.financial.goods.dao;

import com.financial.model.FinancialCategoryParam;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface FinancialCategoryParamMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(FinancialCategoryParam record);

    int insertSelective(FinancialCategoryParam record);

    FinancialCategoryParam selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(FinancialCategoryParam record);

    int updateByPrimaryKey(FinancialCategoryParam record);

  List<FinancialCategoryParam> getList(@Param("sqlString") String sqlString);
}
