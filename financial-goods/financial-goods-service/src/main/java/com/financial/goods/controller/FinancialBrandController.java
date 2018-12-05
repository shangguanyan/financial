package com.financial.goods.controller;

import com.financial.goods.service.FinancialBrandService;
import com.financial.utils.PageRequest;
import com.financial.utils.PageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/brand")
public class FinancialBrandController {
  @Autowired
  FinancialBrandService financialBrandService;
  @PostMapping("/list")
  public ResponseEntity getList(@RequestBody PageRequest pageRequest) {
    PageResult pageResult = financialBrandService.getList(pageRequest);
    return ResponseEntity.ok(pageResult);
  }
  @PostMapping("delete")
  public ResponseEntity delete(HttpServletRequest request, String id){
    financialBrandService.delete(1l);
    return ResponseEntity.ok(HttpStatus.OK);
  }
}
