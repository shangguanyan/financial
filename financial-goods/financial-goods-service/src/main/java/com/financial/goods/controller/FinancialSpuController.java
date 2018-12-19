package com.financial.goods.controller;

import com.financial.goods.service.FinancialSpuService;
import com.financial.utils.PageRequest;
import com.financial.utils.PageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/spu")
public class FinancialSpuController {

  @Autowired
  FinancialSpuService financialSpuService;

  @RequestMapping("/list")
  public ResponseEntity getList(@RequestBody PageRequest pageRequest) {
    PageResult pageResult = financialSpuService.getList(pageRequest);
    return ResponseEntity.ok(pageResult);
  }
}
