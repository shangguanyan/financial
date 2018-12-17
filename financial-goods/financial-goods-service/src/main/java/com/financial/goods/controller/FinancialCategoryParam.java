package com.financial.goods.controller;

import com.financial.goods.service.FinancialCategoryParamService;
import com.financial.utils.PageRequest;
import com.financial.utils.PageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/categoryParam")
public class FinancialCategoryParam {
  @Autowired
//  FinancialCategoryParamService financialCategoryParamService;
  @PostMapping("/getByCid")
  public ResponseEntity getList(@RequestBody PageRequest pageRequest) {
//    PageResult pageResult = financialCategoryParamService.getList(pageRequest);
    return ResponseEntity.ok(null);
  }
}
