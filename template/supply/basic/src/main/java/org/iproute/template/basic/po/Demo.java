package org.iproute.template.basic.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;

/**
 * Demo
 *
 * @author winterfell
 * @since 2021/11/5
 */
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@Data
@TableName("demo")
public class Demo {

    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private Long id;

    @TableField("name")
    private String name;
}
