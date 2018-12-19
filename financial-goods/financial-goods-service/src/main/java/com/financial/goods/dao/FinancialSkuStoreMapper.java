package com.financial.goods.dao;

import com.financial.model.FinancialSkuStore;

public interface FinancialSkuStoreMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(FinancialSkuStore record);

    int insertSelective(FinancialSkuStore record);

    FinancialSkuStore selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(FinancialSkuStore record);

    int updateByPrimaryKey(FinancialSkuStore record);
}