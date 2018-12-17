package com.financial.goods.dao;

import com.financial.model.FinancialSpu;

public interface FinancialSpuMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(FinancialSpu record);

    int insertSelective(FinancialSpu record);

    FinancialSpu selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(FinancialSpu record);

    int updateByPrimaryKey(FinancialSpu record);
}