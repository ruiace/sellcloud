package com.ruipeng.cloud.repository;

import com.ruipeng.cloud.dataobject.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by JF on 2018/8/16.
 */
public interface ProductCategoryRepository extends JpaRepository<ProductCategory,Integer>{

    List<ProductCategory> findByCategoryTypeIn(List<Integer> productCategoryType);

}
