package com.ruipeng.cloud.repository;

import com.ruipeng.cloud.dataobject.ProductInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by JF on 2018/8/16.
 */
public interface ProductInfoRepositoy extends JpaRepository<ProductInfo,String>{

    List<ProductInfo> findByProductStatus(Integer productStatus);

    List<ProductInfo> findByProductIdIn(List<String> productIdList);
}
