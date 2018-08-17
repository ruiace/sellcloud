package com.ruipeng.cloud.message;

import com.fasterxml.jackson.core.type.TypeReference;
import com.ruipeng.cloud.utils.JsonUtil;
import com.ruipeng.cloud.vo.ProductInfoOutput;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by JF on 2018/8/17.
 */
@Component
public class ProductInfoReseave {

    private static final String PRODUCT_STOCK_TEMPLATE = "product_stock_%s";

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @RabbitListener(queuesToDeclare = @Queue("productInfo"))
    public void process(String message){
        List<ProductInfoOutput> productInfoOutputs  = (List<ProductInfoOutput>)JsonUtil.fromJson(message, new TypeReference<List<ProductInfoOutput>>() {});
        for (ProductInfoOutput productInfoOutput : productInfoOutputs) {
            stringRedisTemplate.opsForValue().set(
                    String.format(PRODUCT_STOCK_TEMPLATE,String.valueOf(productInfoOutput.getProductId())),
                    String.valueOf(productInfoOutput.getProductStock())
            );
        }
    }

}
