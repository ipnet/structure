package org.iproute.template.web.back;

import org.iproute.commons.config.mvc.anno.BackRestController;
import org.iproute.template.basic.po.Demo;
import org.iproute.template.service.demo.DemoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;
import java.util.List;

/**
 * DemoController
 *
 * @author winterfell
 * @since 2021/11/6
 */
@BackRestController
@RequestMapping("/demo")
@Slf4j
public class DemoBackController {

    @Value("${spring.application.name}")
    private String applicationName;

    @Autowired
    private DemoService demoService;

    @GetMapping("/listAll")
    public List<Demo> listAll() {

        log.info("do something ...");

        return demoService.listAll();
    }

    @GetMapping("/date")
    public Date date() {
        return new Date();
    }

    @GetMapping("/applicationName")
    public String applicationName() {
        return applicationName;
    }
}
