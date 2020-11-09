package cn.com.mutil.gradle.services.impl;

import cn.com.mutil.gradle.services.ITest;
import org.springframework.stereotype.Service;

/**
 * @author: meng.liu
 * @date: 2020/11/9
 * TODO:
 */
@Service
public class TestImpl implements ITest {

    @Override
    public String hello() {
        return "Hello Gradle...";
    }
}
