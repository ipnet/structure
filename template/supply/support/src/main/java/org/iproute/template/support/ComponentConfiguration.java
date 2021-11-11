package org.iproute.template.support;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * ComponentConfiguration
 *
 * @author winterfell
 * @since 2021/11/5
 */
@EnableFeignClients(basePackages = "org.iproute.template.support.feign")
@ComponentScan
public class ComponentConfiguration {
}
