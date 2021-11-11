package org.iproute.commons.config.mvc.config;

import org.iproute.commons.config.mvc.anno.AppRestController;
import org.iproute.commons.config.mvc.anno.BackRestController;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.PathMatchConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * prefix config
 *
 * @author winterfell
 * @since 2021/11/10
 */
@Configuration
public class PathConfig implements WebMvcConfigurer {

    @Override
    public void configurePathMatch(PathMatchConfigurer configurer) {
        configurer
                .addPathPrefix("/back", c -> c.isAnnotationPresent(BackRestController.class))
                .addPathPrefix("/app", c -> c.isAnnotationPresent(AppRestController.class));
    }

}
