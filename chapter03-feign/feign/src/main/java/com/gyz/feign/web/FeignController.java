package com.gyz.feign.web;

import com.gyz.feign.service.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author gyz
 * @date 2019/4/24 0024
 */
@RestController
public class FeignController {
    //编译器报错，无视。 因为这个Bean是在程序启动的时候注入的，编译器感知不到，所以报错。
    @Autowired
    FeignService feignService;

    @RequestMapping(value = "/hi")
    public String sayHi() {
        return feignService.say();
    }
}
