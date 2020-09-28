package com.neuedu.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.neuedu.pojo.CheckItem;


public interface ICheckItemService extends IService<CheckItem> {

    Object list(CheckItem checkItem);

    boolean add(CheckItem checkItem);

    boolean batchdel(Integer[] ids);

}
