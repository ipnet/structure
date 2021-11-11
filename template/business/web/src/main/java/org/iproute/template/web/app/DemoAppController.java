package org.iproute.template.web.app;

import lombok.extern.slf4j.Slf4j;
import org.iproute.commons.config.mvc.anno.AppRestController;
import org.iproute.template.basic.po.Demo;
import org.iproute.template.web.back.DemoBackController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * DemoController
 *
 * @author winterfell
 * @since 2021/11/6
 */
@AppRestController
@RequestMapping("/demo")
@Slf4j
public class DemoAppController {

    @Autowired
    private DemoBackController demoBackController;

    @GetMapping("/listAll")
    public List<Demo> listAll() {
        return demoBackController.listAll();
    }

}
