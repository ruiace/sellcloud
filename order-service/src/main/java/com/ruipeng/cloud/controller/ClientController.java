package com.ruipeng.cloud.controller;

import com.ruipeng.cloud.client.ProductClient;
import com.sun.org.apache.regexp.internal.RE;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.cloud.client.loadbalancer.LoadBalancerRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.io.PipedReader;
import java.net.URI;

/**
 * Created by JF on 2018/8/16.
 */
@RestController
public class ClientController {

    /**
     * (1)
     */


/*
  @GetMapping("/client/msg")
  public String getMsg(){
      RestTemplate restTemplate = new RestTemplate();
      String msg = restTemplate.getForObject("http://localhost:8080/msg",String.class);
      return msg;
  }
*/


    /**
     * (2)
     */

   /* @Autowired
    private LoadBalancerClient loadBalancerClient;

    @GetMapping("/client/msg")
    public String getMsg(){
        ServiceInstance productservice = loadBalancerClient.choose("PRODUCTSERVICE");
        String host = productservice.getHost();
        int port = productservice.getPort();
        String url = String.format("http://%s:%s/msg",host,port);

        RestTemplate restTemplate = new RestTemplate();
        String msg = restTemplate.getForObject(url,String.class);
        return msg;
    }*/


    /**
     * (3)
     *
     */

   /* @GetMapping("/client/msg")
    public String getMsg(){
        RestTemplate restTemplate = new RestTemplate();
        String msg = restTemplate.getForObject("http://PRODUCTSERVICE/msg",String.class);
        return msg;
    }*/

   @Autowired
   private  ProductClient productClient;

    public String getMsg(){
        String msg =productClient.msg();
        return msg;
    }

}
