package com.neuedu.pojo;

import com.neuedu.util.BasePojo;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;


@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class UmsRole extends BasePojo {

    private static final long serialVersionUID = 1L;

    private String name;

    private Integer active;

}
