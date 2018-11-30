package com.financial.goods.dao;

import com.financial.goods.model.FinancialCategory;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface FinancialCategoryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(FinancialCategory record);

    int insertSelective(FinancialCategory record);

    FinancialCategory selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(FinancialCategory record);

    int updateByPrimaryKey(FinancialCategory record);

    List<FinancialCategory> queryListByParentId(@Param("pid") Long pid);
}
