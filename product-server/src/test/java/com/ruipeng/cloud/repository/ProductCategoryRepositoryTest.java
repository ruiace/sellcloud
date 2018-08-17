package com.ruipeng.cloud.repository;

import com.ruipeng.cloud.ProductServerApplicationTests;
import com.ruipeng.cloud.dataobject.ProductCategory;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.naming.ldap.PagedResultsControl;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by JF on 2018/8/16.
 */
@Component
public class ProductCategoryRepositoryTest  extends ProductServerApplicationTests{

    @Autowired
    private ProductCategoryRepository productCategoryRepository;

    @Test
    public void findByCategoryTypeIn() throws Exception {
        List<ProductCategory> byCategoryTypeIn = productCategoryRepository.findByCategoryTypeIn(Arrays.asList(11, 12));
        System.out.println(byCategoryTypeIn.toArray());
    }

}