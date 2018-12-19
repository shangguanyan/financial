package com.financial.goods.dao;

import com.financial.goods.vo.FinancailSpuVo;
import com.financial.model.FinancialSku;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface FinancialSkuMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(FinancialSku record);

    int insertSelective(FinancialSku record);

    FinancialSku selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(FinancialSku record);

    int updateByPrimaryKey(FinancialSku record);

}
