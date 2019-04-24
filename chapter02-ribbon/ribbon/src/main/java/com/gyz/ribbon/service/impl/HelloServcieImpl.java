package com.gyz.ribbon.service.impl;

import com.gyz.ribbon.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author gyz
 * @date 2019/4/24 0024
 */
@Service
public class HelloServcieImpl implements HelloService {

    @Autowired
    RestTemplate restTemplate;

    @Override
    public String say() {
        return restTemplate.getForObject("http://SERVICE-HI/say",String.class);
    }
}
