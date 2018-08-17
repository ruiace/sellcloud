package com.ruipeng.cloud.service;

import com.ruipeng.cloud.dataobject.ProductInfo;
import com.ruipeng.cloud.vo.DecreaseStockInput;
import com.ruipeng.cloud.vo.ProductInfoOutput;

import java.util.List;

/**
 * Created by JF on 2018/8/16.
 */
public interface ProductInfoService {

    /**
     * 查询所有在架商品列表
     */
    List<ProductInfo> findUpAll();

    /**
     * 查询商品列表
     * @param productIdList
     * @return
     */
    List<ProductInfoOutput> findList(List<String> productIdList);

    /**
     * 扣库存
     * @param decreaseStockInputList
     */
    void decreaseStock(List<DecreaseStockInput> decreaseStockInputList);
}
