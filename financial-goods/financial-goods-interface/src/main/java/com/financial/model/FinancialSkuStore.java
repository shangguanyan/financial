package com.financial.model;

public class FinancialSkuStore {
    private Integer id;

    private Integer skuId;

    private Integer killStore;

    private Integer killTotal;

    private Integer storeTotal;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSkuId() {
        return skuId;
    }

    public void setSkuId(Integer skuId) {
        this.skuId = skuId;
    }

    public Integer getKillStore() {
        return killStore;
    }

    public void setKillStore(Integer killStore) {
        this.killStore = killStore;
    }

    public Integer getKillTotal() {
        return killTotal;
    }

    public void setKillTotal(Integer killTotal) {
        this.killTotal = killTotal;
    }

    public Integer getStoreTotal() {
        return storeTotal;
    }

    public void setStoreTotal(Integer storeTotal) {
        this.storeTotal = storeTotal;
    }
}