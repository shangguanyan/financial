package com.financial.goods.dao;

import com.financial.goods.vo.FinancailSpuVo;
import com.financial.model.FinancialSpu;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface FinancialSpuMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(FinancialSpu record);

    int insertSelective(FinancialSpu record);

    FinancialSpu selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(FinancialSpu record);

    int updateByPrimaryKey(FinancialSpu record);

  List<FinancailSpuVo> getList(@Param("sqlString") String sqlString);
}
