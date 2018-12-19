package com.financial.goods.dao;

import com.financial.model.FinancialSkuValue;

public interface FinancialSkuValueMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(FinancialSkuValue record);

    int insertSelective(FinancialSkuValue record);

    FinancialSkuValue selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(FinancialSkuValue record);

    int updateByPrimaryKey(FinancialSkuValue record);
}