package org.iproute.templatedep.controller;

import org.iproute.template.support.feign.DemoFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * BackController
 *
 * @author winterfell
 * @since 2021/11/10
 */
@RestController
public class BackController {

    @Value("${spring.application.name}")
    private String applicationName;

    @Autowired
    private DemoFeign demoFeign;


    /**
     * App name this string.
     *
     * @return the string
     */
    @GetMapping("/appName/this")
    public String appNameThis() {
        return applicationName;
    }

    /**
     * App name that string.
     *
     * @return the string
     */
    @GetMapping("/appName/that")
    public String appNameThat() {
        return demoFeign.applicationName();
    }

}
