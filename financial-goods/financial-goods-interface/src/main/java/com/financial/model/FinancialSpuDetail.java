package com.financial.model;

public class FinancialSpuDetail {
    private Integer id;

    private Integer spuId;

    private String packList;

    private String afterService;

    private String desc;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSpuId() {
        return spuId;
    }

    public void setSpuId(Integer spuId) {
        this.spuId = spuId;
    }

    public String getPackList() {
        return packList;
    }

    public void setPackList(String packList) {
        this.packList = packList == null ? null : packList.trim();
    }

    public String getAfterService() {
        return afterService;
    }

    public void setAfterService(String afterService) {
        this.afterService = afterService == null ? null : afterService.trim();
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc == null ? null : desc.trim();
    }
}