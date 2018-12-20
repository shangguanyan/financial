package com.financial.goods.vo;

import java.util.List;

public class FinancialCategorySelect {
    private Integer value;

    private String label;

    private Integer parentId;

    private List<FinancialCategorySelect> children;

  public Integer getParentId() {
    return parentId;
  }

  public void setParentId(Integer parentId) {
    this.parentId = parentId;
  }

  public Integer getValue() {
    return value;
  }

  public void setValue(Integer value) {
    this.value = value;
  }

  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public List<FinancialCategorySelect> getChildren() {
    return children;
  }

  public void setChildren(List<FinancialCategorySelect> children) {
    this.children = children;
  }
}
