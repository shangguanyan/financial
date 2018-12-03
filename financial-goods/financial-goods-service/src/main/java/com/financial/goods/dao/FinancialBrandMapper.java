package com.financial.goods.dao;

import com.financial.model.FinancialBrand;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface FinancialBrandMapper {
    int deleteByPrimaryKey(Long id);

    int insert(FinancialBrand record);

    int insertSelective(FinancialBrand record);

    FinancialBrand selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(FinancialBrand record);

    int updateByPrimaryKey(FinancialBrand record);
}
