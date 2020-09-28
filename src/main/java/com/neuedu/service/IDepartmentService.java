package com.neuedu.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.neuedu.pojo.Department;


public interface IDepartmentService extends IService<Department> {
    Object list(Department department);

    boolean add(Department department);

    boolean batchdel(Integer[] ids);
}
