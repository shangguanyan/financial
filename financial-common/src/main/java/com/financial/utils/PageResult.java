package com.financial.utils;

import java.util.List;

public class PageResult {
  //总条数
  private long totalNum;
  //总页数
  private long totalPage;
  //当前页数据
  private List<?> results;

  public PageResult(long totalNum,long totalPage,List<?> results){
    this.totalNum = totalNum;
    this.totalPage = totalPage;
    this.results = results;
  }
  public long getTotalNum() {
    return totalNum;
  }

  public void setTotalNum(long totalNum) {
    this.totalNum = totalNum;
  }

  public long getTotalPage() {
    return totalPage;
  }

  public void setTotalPage(long totalPage) {
    this.totalPage = totalPage;
  }

  public List<?> getResults() {
    return results;
  }

  public void setResults(List<?> results) {
    this.results = results;
  }
}
