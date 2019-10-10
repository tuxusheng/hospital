package com.ys.hospital.pojo;

import java.io.Serializable;
import lombok.Data;

/**
 * (Role)实体类
 *
 * @author yusheng
 * @since 2019-10-10 08:09:40
 */
@Data
public class Role implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private Integer roleId;
    
    private String roleName;
    
}