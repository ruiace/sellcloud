package com.ruipeng.cloud.service.impl;

import com.ruipeng.cloud.dataobject.ProductCategory;
import com.ruipeng.cloud.repository.ProductCategoryRepository;
import com.ruipeng.cloud.service.ProductCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by JF on 2018/8/16.
 */
@Service
public class ProductCategoryServiceImpl implements ProductCategoryService {

    @Autowired
    private ProductCategoryRepository productCategoryRepository;

    @Override
    public List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList) {
        return productCategoryRepository.findByCategoryTypeIn(categoryTypeList);
    }
}
