package com.ldf.dubbo.demo.provider;

import com.alibaba.dubbo.config.annotation.Service;
import com.ldf.dubbo.demo.api.ITestService;

/**
 * @author lidefu
 * @date 2019/2/18 16:32
 */
@Service
public class TestServiceImpl implements ITestService {

    @Override
    public String test() {
        return "Provider TestServiceImpl test success! ";
    }

}
