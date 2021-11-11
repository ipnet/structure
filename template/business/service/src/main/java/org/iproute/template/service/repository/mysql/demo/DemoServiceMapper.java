package org.iproute.template.service.repository.mysql.demo;

import org.iproute.template.basic.po.Demo;
import org.iproute.template.support.repository.mysql.demo.DemoMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * DemoServiceMapper
 *
 * @author winterfell
 * @since 2021/11/10
 */
@Mapper
public interface DemoServiceMapper extends DemoMapper {

    /**
     * get Demo by id
     *
     * @param id the id
     * @return the by id
     */
    Demo getById(Long id);

}
