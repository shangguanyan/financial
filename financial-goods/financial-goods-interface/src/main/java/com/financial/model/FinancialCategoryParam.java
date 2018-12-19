package com.financial.model;

public class FinancialCategoryParam {
    private Integer id;

    private String paramName;

    private Integer search;

    private Integer categoryId;

    private Boolean isEdit;

  public Boolean getIsEdit() {
    return isEdit;
  }

  public void setEdit(Boolean edit) {
    isEdit = edit;
  }

  public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getParamName() {
        return paramName;
    }

    public void setParamName(String paramName) {
        this.paramName = paramName == null ? null : paramName.trim();
    }

    public Integer getSearch() {
        return search;
    }

    public void setSearch(Integer search) {
        this.search = search;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

  @Override
  public String toString() {
    return "FinancialCategoryParam{" +
      "id=" + id +
      ", paramName='" + paramName + '\'' +
      ", search=" + search +
      ", categoryId=" + categoryId +
      ", isEdit=" + isEdit +
      '}';
  }
}
