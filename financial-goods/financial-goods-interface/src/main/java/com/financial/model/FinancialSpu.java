package com.financial.model;

import java.util.Date;

public class FinancialSpu {
    private Integer id;

    private String title;

    private Integer brandId;

    private Integer brandCategoryId;

    private Integer saleAble;

    private Integer valid;

    private Date createTime;

    private Date updateTime;

  public Integer getBrandCategoryId() {
    return brandCategoryId;
  }

  public void setBrandCategoryId(Integer brandCategoryId) {
    this.brandCategoryId = brandCategoryId;
  }

  public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Integer getBrandId() {
        return brandId;
    }

    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    public Integer getSaleAble() {
        return saleAble;
    }

    public void setSaleAble(Integer saleAble) {
        this.saleAble = saleAble;
    }

    public Integer getValid() {
        return valid;
    }

    public void setValid(Integer valid) {
        this.valid = valid;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
