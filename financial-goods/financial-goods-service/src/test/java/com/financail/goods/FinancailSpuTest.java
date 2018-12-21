package com.financail.goods;

import com.financial.goods.FinancialGoodsApplication;
import com.financial.goods.service.FinancialCategoryService;
import com.financial.goods.service.FinancialSpuService;
import com.financial.utils.PageRequest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = FinancialGoodsApplication.class)
public class FinancailSpuTest {
  @Autowired
  FinancialSpuService financialSpuService;
  @Autowired
  FinancialCategoryService financialCategoryService;

  @Test
  public void testName() {
    List names = new ArrayList<>();
    String result = financialSpuService.categoryName(682,names);
    System.out.println(result+"==================="+names);
  }

  @Test
  public void testGetList(){
    PageRequest pageRequest = new PageRequest();
    financialSpuService.getList(pageRequest);
  }

  @Test
  public void testPid() {
    List results = financialCategoryService.listPid();
    System.out.println(results);
  }
}
