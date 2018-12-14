package com.financial.goods.controller;

import com.financial.goods.service.FinancialBrandService;
import com.financial.goods.vo.FinancialBrandCategoryVo;
import com.financial.model.FinancialCategory;
import com.financial.utils.PageRequest;
import com.financial.utils.PageResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping("/brand")
public class FinancialBrandController {
  Logger logger = LoggerFactory.getLogger(FinancialBrandController.class);
  @Autowired
  FinancialBrandService financialBrandService;
  @PostMapping("/list")
  public ResponseEntity getList(@RequestBody PageRequest pageRequest) {
    PageResult pageResult = financialBrandService.getList(pageRequest);
    return ResponseEntity.ok(pageResult);
  }
  @PostMapping("delete")
  public ResponseEntity delete(HttpServletRequest request, @RequestParam Long id){
    financialBrandService.delete(id);
    return ResponseEntity.ok(HttpStatus.OK);
  }
  @PostMapping("add")
  public ResponseEntity add(@RequestBody FinancialBrandCategoryVo financialBrandCategoryVo){
    logger.info(financialBrandCategoryVo.toString());
    //判断是添加还是修改，使用id作为判断条件
    if(financialBrandCategoryVo.getIsEdit()){
      financialBrandService.updateFinancialBrand(financialBrandCategoryVo);
    }else {
      financialBrandService.addFinancialBrand(financialBrandCategoryVo);
    }
    return ResponseEntity.ok(HttpStatus.CREATED);
  }
  @GetMapping("/getByBid")
  public ResponseEntity<List<FinancialCategory>> getByBid(@RequestParam Long bid){
    List<FinancialCategory> financialCategories = financialBrandService.getByBid(bid);
    return ResponseEntity.ok(financialCategories);
  }
}
