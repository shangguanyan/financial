package com.financial.goods.controller;

import com.financial.goods.service.FinancialBrandService;
import com.financial.utils.PageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/brand")
public class FinancialBrandController {
  @Autowired
  FinancialBrandService financialBrandService;
  @GetMapping("/list")
  public ResponseEntity<PageResult> getList() {
    PageResult pageResult = financialBrandService.getList();
    return ResponseEntity.ok(pageResult);
  }
}
