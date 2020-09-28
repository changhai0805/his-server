package com.neuedu.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.neuedu.pojo.ConstantItem;


public interface IConstantItemService extends IService<ConstantItem> {
    Object list(ConstantItem constantItem);

    boolean add(ConstantItem constantItem);

    boolean batchdel(Integer[] ids);
}
