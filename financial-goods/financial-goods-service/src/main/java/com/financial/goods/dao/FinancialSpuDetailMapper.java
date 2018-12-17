package com.financial.goods.dao;

import com.financial.model.FinancialSpuDetail;

public interface FinancialSpuDetailMapper {
    int deleteByPrimaryKey(Integer spuId);

    int insert(FinancialSpuDetail record);

    int insertSelective(FinancialSpuDetail record);

    FinancialSpuDetail selectByPrimaryKey(Integer spuId);

    int updateByPrimaryKeySelective(FinancialSpuDetail record);

    int updateByPrimaryKeyWithBLOBs(FinancialSpuDetail record);

    int updateByPrimaryKey(FinancialSpuDetail record);
}