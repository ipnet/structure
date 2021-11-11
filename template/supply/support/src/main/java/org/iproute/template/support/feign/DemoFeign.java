package org.iproute.template.support.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * DemoFeign
 *
 * @author winterfell
 * @since 2021/11/10
 */
@FeignClient("template")
public interface DemoFeign {

    /**
     * Application name string.
     *
     * @return the string
     */
    @GetMapping("/back/demo/applicationName")
    String applicationName();
}
