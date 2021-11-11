package org.iproute.template.service.demo;

import com.baomidou.mybatisplus.core.metadata.IPage;
import org.iproute.template.basic.po.Demo;

import java.util.List;

/**
 * DemoService
 *
 * @author winterfell
 * @since 2021/11/5
 */
public interface DemoService {

    /**
     * List all list.
     *
     * @return the list
     */
    List<Demo> listAll();


    /**
     * Page list demo.
     *
     * @param page the page
     * @return the page
     */
    IPage<Demo> pageList(IPage<?> page);

}
