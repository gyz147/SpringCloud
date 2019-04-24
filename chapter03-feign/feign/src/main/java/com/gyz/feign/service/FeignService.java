package com.gyz.feign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author gyz
 * @date 2019/4/24 0024
 */
@FeignClient(value = "SERVICE-HI")
public interface FeignService {
    @RequestMapping(value = "say",method = RequestMethod.GET)
    public String say();
}
