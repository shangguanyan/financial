package com.financial.model;

import java.util.List;

public class FinancialMenu {
    private Integer id;

    private String title;

    private String action;

    private String path;

    private Integer parentId;

    private List<FinancialMenu> childrens;

    public List<FinancialMenu> getChildrens() {
      return childrens;
    }

    public void setChildrens(List<FinancialMenu> childrens) {
      this.childrens = childrens;
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

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action == null ? null : action.trim();
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path == null ? null : path.trim();
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    @Override
    public String toString() {
      return "FinancialMenu{" +
        "id=" + id +
        ", title='" + title + '\'' +
        ", action='" + action + '\'' +
        ", path='" + path + '\'' +
        ", parentId=" + parentId +
        ", childrens=" + childrens +
        '}';
    }
}
