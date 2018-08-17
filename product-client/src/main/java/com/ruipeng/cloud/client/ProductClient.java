package com.ruipeng.cloud.client;

import com.ruipeng.cloud.vo.DecreaseStockInput;
import com.ruipeng.cloud.vo.ProductInfoOutput;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

/**
 * 2017-12-10 21:04
 */
@FeignClient(name = "productserivce")
public interface ProductClient {

    @GetMapping("/msg")
    public String msg();

    @PostMapping("/product/listForOrder")
    List<ProductInfoOutput> listForOrder(@RequestBody List<String> productIdList);

    @PostMapping("/product/decreaseStock")
    void decreaseStock(@RequestBody List<DecreaseStockInput> decreaseStockInputList);
}
