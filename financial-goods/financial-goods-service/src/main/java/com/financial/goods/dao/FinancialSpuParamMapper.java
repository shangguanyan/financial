package com.financial.goods.dao;

import com.financial.model.FinancialSpuParam;

public interface FinancialSpuParamMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(FinancialSpuParam record);

    int insertSelective(FinancialSpuParam record);

    FinancialSpuParam selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(FinancialSpuParam record);

    int updateByPrimaryKey(FinancialSpuParam record);
}