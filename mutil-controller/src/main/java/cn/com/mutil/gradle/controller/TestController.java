package cn.com.mutil.gradle.controller;

import cn.com.mutil.gradle.services.ITest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: meng.liu
 * @date: 2020/11/9
 * TODO:
 */
@RestController
@RequestMapping("test")
public class TestController {

    private final ITest test;

    @Autowired
    public TestController(ITest test) {
        this.test = test;
    }

    @GetMapping("v1/hello")
    public String test() {
        return "Hello Gradle Project.";
    }

}
