package com.ruipeng.cloud.repository;

import com.ruipeng.cloud.ProductServerApplicationTests;
import com.ruipeng.cloud.dataobject.ProductInfo;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by JF on 2018/8/16.
 */
@Component
public class ProductInfoRepositoyTest extends ProductServerApplicationTests {

    @Autowired
    private ProductInfoRepositoy productInfoRepositoy;

    @Test
    public void findByProductStatus() throws Exception {
        List<ProductInfo> byProductStatus = productInfoRepositoy.findByProductStatus(0);
        System.out.println(byProductStatus.toArray());
    }

}