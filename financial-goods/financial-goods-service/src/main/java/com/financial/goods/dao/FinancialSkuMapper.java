package com.financial.goods.dao;

import com.financial.model.FinancialSku;

public interface FinancialSkuMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(FinancialSku record);

    int insertSelective(FinancialSku record);

    FinancialSku selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(FinancialSku record);

    int updateByPrimaryKey(FinancialSku record);
}