package com.financial.goods.vo;

import java.util.Arrays;
import java.util.Map;

public class FinancialBrandCategoryVo {
  private String name;
  private String letter; // 品牌首字母
  private String image;// 品牌logo
  private Map[] categories; // 品牌所属的商品分类数组

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getLetter() {
    return letter;
  }

  public void setLetter(String letter) {
    this.letter = letter;
  }

  public String getImage() {
    return image;
  }

  public void setImage(String image) {
    this.image = image;
  }

  public Map[] getCategories() {
    return categories;
  }

  public void setCategories(Map[] categories) {
    this.categories = categories;
  }

  @Override
  public String toString() {
    return "FinancialBrandCategoryVo{" +
      "name='" + name + '\'' +
      ", letter='" + letter + '\'' +
      ", imageUrl='" + image + '\'' +
      ", categories=" + Arrays.toString(categories) +
      '}';
  }
}
