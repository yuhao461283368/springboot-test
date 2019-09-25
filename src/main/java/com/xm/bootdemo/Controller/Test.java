package com.xm.bootdemo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: xiaomi
 * @CreateDate: 2019/9/25$ 21:34$
 * @Version: 1.0
 */
@RestController
public class Test {
    @GetMapping("/test")
    public String test(){
        return "hello world111";
    }
}
