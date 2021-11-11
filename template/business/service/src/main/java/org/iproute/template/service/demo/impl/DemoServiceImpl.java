package org.iproute.template.service.demo.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import org.iproute.template.basic.po.Demo;
import org.iproute.template.service.demo.DemoService;
import org.iproute.template.service.repository.mysql.demo.DemoServiceMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * DemoServiceImpl
 *
 * @author winterfell
 * @since 2021/11/5
 */
@Service
public class DemoServiceImpl implements DemoService {

    @Resource
    private DemoServiceMapper demoServiceMapper;

    @Override
    public List<Demo> listAll() {
        return demoServiceMapper.selectList(null);
    }

    @Override
    public IPage<Demo> pageList(IPage<?> page) {
        return null;
    }
}
