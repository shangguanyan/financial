package com.financial.menu.dao;

import com.financial.model.FinancialMenu;

import java.util.List;

public interface FinancialMenuMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(FinancialMenu record);

    int insertSelective(FinancialMenu record);

    FinancialMenu selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(FinancialMenu record);

    int updateByPrimaryKey(FinancialMenu record);

    List<FinancialMenu> menuList();
}
