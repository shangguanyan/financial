package com.financial.menu.controller;

import com.financial.goods.model.FinancialMenu;
import com.financial.menu.service.FinancialMenuService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("menu")
public class FinancialMenuController {
  Logger logger = LoggerFactory.getLogger(FinancialMenuController.class);
  @Autowired
  FinancialMenuService financialMenuService;

  @GetMapping("list")
  public ResponseEntity<List<FinancialMenu>> getMenuList() {
    List<FinancialMenu> financialMenus = financialMenuService.getMenuList();
    return ResponseEntity.ok(financialMenus);
  }
}
