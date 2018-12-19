package com.financial.goods.service;

import com.financial.goods.dao.FinancialBrandCategoryMapper;
import com.financial.goods.dao.FinancialBrandMapper;
import com.financial.goods.vo.FinancialBrandCategoryVo;
import com.financial.model.FinancialBrand;
import com.financial.model.FinancialBrandCategory;
import com.financial.model.FinancialCategory;
import com.financial.utils.PageRequest;
import com.financial.utils.PageResult;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Service
public class FinancialBrandService {
  @Autowired
  FinancialBrandMapper financialBrandMapper;
  @Autowired
  FinancialBrandCategoryMapper financialBrandCategoryMapper;

  public PageResult getList(PageRequest pageRequest) {
    String sqlString = pageRequest.getSql();

    PageHelper.startPage(pageRequest.getCurrentPage(),pageRequest.getPageRows());
    List<FinancialBrand> financialBrandList = financialBrandMapper.getList(sqlString);
    PageInfo<FinancialBrand> pageInfo = new PageInfo<FinancialBrand>(financialBrandList);
    return new PageResult(pageInfo.getTotal(),pageInfo.getPages(),pageInfo.getList());
  }

  @Transactional(rollbackFor = Exception.class)
  public void delete(Long brandid) {
    //删除关联关系
    financialBrandCategoryMapper.deleteByBrandId(brandid);
    financialBrandMapper.deleteByPrimaryKey(brandid);
  }

  @Transactional(rollbackFor = Exception.class)
  public void addFinancialBrand(FinancialBrandCategoryVo financialBrandCategoryVo) {
    //添加关联关系表和品牌表
    FinancialBrand financialBrand = new FinancialBrand();
    BeanUtils.copyProperties(financialBrandCategoryVo,financialBrand);
    financialBrandMapper.insert(financialBrand);
    this.addBrandCategory(financialBrandCategoryVo,financialBrand.getId().intValue());
  }

  private void addBrandCategory(FinancialBrandCategoryVo financialBrandCategoryVo,Integer brandId){
    Map[] categorys = financialBrandCategoryVo.getCategories();
    for(Map map:categorys){
      FinancialBrandCategory financialBrandCategory = new FinancialBrandCategory();
      financialBrandCategory.setBrandName(financialBrandCategoryVo.getName());
      financialBrandCategory.setCategoryId(Integer.parseInt(map.get("id").toString()));
      financialBrandCategory.setCategoryName(map.get("name").toString());
      financialBrandCategory.setBrandId(brandId);
      financialBrandCategoryMapper.insert(financialBrandCategory);
    }
  }

  public List<FinancialCategory> getByBid(Long bid) {
    return financialBrandCategoryMapper.getByBid(bid);
  }

  /**
   * 修改 品牌
   * @param financialBrandCategoryVo
   */
  public void updateFinancialBrand(FinancialBrandCategoryVo financialBrandCategoryVo) {
    //先删除 品牌和菜单之间的关系
    financialBrandCategoryMapper.deleteByBrandId(financialBrandCategoryVo.getBrandId());
    FinancialBrand financialBrand = new FinancialBrand();
    BeanUtils.copyProperties(financialBrandCategoryVo,financialBrand);
    financialBrand.setId(financialBrandCategoryVo.getBrandId());
    financialBrandMapper.updateByPrimaryKey(financialBrand);
    this.addBrandCategory(financialBrandCategoryVo,financialBrand.getId().intValue());
  }
}
