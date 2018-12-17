package com.financial.goods.dao;

import com.financial.model.FinancialSpuCategoryparam;

public interface FinancialSpuCategoryparamMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(FinancialSpuCategoryparam record);

    int insertSelective(FinancialSpuCategoryparam record);

    FinancialSpuCategoryparam selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(FinancialSpuCategoryparam record);

    int updateByPrimaryKey(FinancialSpuCategoryparam record);
}