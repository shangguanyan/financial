package com.financial.goods.vo;

import com.financial.model.FinancialSpu;

public class FinancailSpuVo extends FinancialSpu {
  private Integer categoryId;
  private String categoryName;
  private String brandName;

  public Integer getCategoryId() {
    return categoryId;
  }

  public void setCategoryId(Integer categoryId) {
    this.categoryId = categoryId;
  }

  public String getCategoryName() {
    return categoryName;
  }

  public void setCategoryName(String categoryName) {
    this.categoryName = categoryName;
  }

  public String getBrandName() {
    return brandName;
  }

  public void setBrandName(String brandName) {
    this.brandName = brandName;
  }
}
