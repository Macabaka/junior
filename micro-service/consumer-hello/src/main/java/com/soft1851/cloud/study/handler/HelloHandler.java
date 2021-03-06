package com.soft1851.cloud.study.handler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author Johnny
 * @Date: 2020/9/14 08:43
 * @Description:
 */
@RequestMapping("/consumer")
@RestController
public class HelloHandler {
    @Resource
    private RestTemplate restTemplate;

    @GetMapping("hello")
    public String  getHello(){
        //通过restTemplate来调用provider提供的服务
        return restTemplate.getForObject("http://johnnycc.com:8001/hello",String.class);
    }

}
