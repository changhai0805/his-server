package com.neuedu.service;

import com.neuedu.pojo.ConstantType;
import com.baomidou.mybatisplus.extension.service.IService;


public interface IConstantTypeService extends IService<ConstantType> {

    Object list(ConstantType constantType);

    boolean add(ConstantType constantType);

    boolean batchdel(Integer[] ids);
}
