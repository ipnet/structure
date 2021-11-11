package org.iproute.template.basic.dto;

import org.iproute.template.basic.po.Demo;
import lombok.*;

/**
 * DemoDTO
 *
 * @author winterfell
 * @since 2021/11/5
 */
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@Data
public class DemoDTO {
    private Demo demo;
}
