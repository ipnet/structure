package org.iproute.template.basic.vo;

import org.iproute.template.basic.po.Demo;
import lombok.*;

/**
 * DemoVO
 *
 * @author winterfell
 * @since 2021/11/5
 */
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@Data
public class DemoVO {
    private Demo demo;
}
