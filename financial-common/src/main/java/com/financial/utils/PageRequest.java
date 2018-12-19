package com.financial.utils;

import java.util.Map;

public class PageRequest {
  //当前页码
  private int currentPage;
  //每页大小
  private int pageRows;
  //搜索条件
  private Map<String,String> searchKeys;
  //排序字段
  private String sortBy;
  //升降序
  private boolean asc;

  public PageRequest() {
  }

  public int getCurrentPage() {
    return currentPage;
  }

  public void setCurrentPage(int currentPage) {
    this.currentPage = currentPage;
  }

  public int getPageRows() {
    return pageRows;
  }

  public void setPageRows(int pageRows) {
    this.pageRows = pageRows;
  }

  public Map<String, String> getSearchKeys() {
    return searchKeys;
  }

  public void setSearchKeys(Map<String, String> searchKeys) {
    this.searchKeys = searchKeys;
  }

  public String getSortBy() {
    return sortBy;
  }

  public void setSortBy(String sortBy) {
    this.sortBy = sortBy;
  }

  public boolean getAsc() {
    return asc;
  }

  public void setAsc(boolean asc) {
    this.asc = asc;
  }

  public String getSql() {
    StringBuffer sqlString = new StringBuffer("where 1=1 ");
    if (searchKeys != null) {
      searchKeys.keySet().forEach(key -> {
        if (!(searchKeys.get(key) == "" || searchKeys.get(key) == null)) {
          if (key.toString().endsWith("id")) {
            sqlString.append("and ").append(key).append("=").append(searchKeys.get(key));
          } else {
            sqlString.append(" and ").append(key).append(" like '%").append(searchKeys.get(key)).append("%'");
          }
        }
      });
    if(this.sortBy !=null){
      sqlString.append(" order by " + this.sortBy );
    }else{
      sqlString.append(" order by id ");
    }
    if(!this.asc){
      sqlString.append(" desc");
    }
    }
    return sqlString.toString();
  }
}
