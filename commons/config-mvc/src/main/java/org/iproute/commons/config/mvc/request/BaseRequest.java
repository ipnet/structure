package org.iproute.commons.config.mvc.request;

import lombok.*;

import java.io.Serializable;
import java.util.List;

/**
 * BaseRequest
 *
 * @author winterfell
 * @since 2021/11/10
 */
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@Data
public class BaseRequest<T> {

    private Serializable id;

    private List<Serializable> idList;

    private T entity;

    private List<T> entities;
}
