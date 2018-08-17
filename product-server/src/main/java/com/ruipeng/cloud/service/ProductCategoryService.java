package com.ruipeng.cloud.service;

import com.ruipeng.cloud.dataobject.ProductCategory;

import java.util.List;

/**
 * Created by JF on 2018/8/16.
 */
public interface ProductCategoryService {

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);
}
