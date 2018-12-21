package com.financial.goods.dao;

import com.financial.goods.vo.FinancialCategorySelect;
import com.financial.model.FinancialCategory;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface FinancialCategoryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(FinancialCategory record);

    int insertSelective(FinancialCategory record);

    FinancialCategory selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(FinancialCategory record);

    int updateByPrimaryKey(FinancialCategory record);

    List<FinancialCategory> queryListByParentId(@Param("id") Long pid);

  List<FinancialCategorySelect> listPid();
}
