package com.financial.model;

public class FinancialCategory {
    private Integer id;

    private String name;

    private Integer isParent;

    private Integer parentId;

    private Integer sort;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getIsParent() {
        return isParent;
    }

    public void setIsParent(Integer isParent) {
        this.isParent = isParent;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

  @Override
  public String toString() {
    return "FinancialCategory{" +
      "id=" + id +
      ", name='" + name + '\'' +
      ", isParent=" + isParent +
      ", parentId=" + parentId +
      ", sort=" + sort +
      '}';
  }
}
