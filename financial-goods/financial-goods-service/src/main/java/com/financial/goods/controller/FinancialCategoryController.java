package com.financial.goods.controller;

import com.financial.goods.model.FinancialCategory;
import com.financial.goods.service.FinancialCategoryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("category")
public class FinancialCategoryController {
  Logger logger = LoggerFactory.getLogger(FinancialCategoryController.class);

  @Autowired
  FinancialCategoryService financialCategoryService;

  @RequestMapping(value = "list", method = {RequestMethod.GET})
  public ResponseEntity<List<FinancialCategory>> queryCategoryByParentId(@RequestParam(value="pid")Long pid) {
    List<FinancialCategory> financialCategoryList = financialCategoryService.queryListByParentId(pid);
    return ResponseEntity.ok(financialCategoryList);
  }
}
