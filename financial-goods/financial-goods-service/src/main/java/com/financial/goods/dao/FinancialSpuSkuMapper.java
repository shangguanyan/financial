package com.financial.goods.dao;

import com.financial.model.FinancialSpuSku;

public interface FinancialSpuSkuMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(FinancialSpuSku record);

    int insertSelective(FinancialSpuSku record);

    FinancialSpuSku selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(FinancialSpuSku record);

    int updateByPrimaryKey(FinancialSpuSku record);
}