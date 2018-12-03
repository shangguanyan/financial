package com.financial.menu.service;

import com.financial.menu.dao.FinancialMenuMapper;
import com.financial.model.FinancialMenu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FinancialMenuService {
  @Autowired
  FinancialMenuMapper financialMenuMapper;
  public List<FinancialMenu> getMenuList() {
    return financialMenuMapper.menuList();
  }
}
