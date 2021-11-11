package org.iproute.template.support.repository.mysql.demo;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.iproute.template.basic.po.Demo;
import org.apache.ibatis.annotations.Mapper;

/**
 * DemoMapper
 *
 * @author winterfell
 * @since 2021/11/10
 */
@Mapper
public interface DemoMapper extends BaseMapper<Demo> {
}
