package com.neuedu.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.neuedu.pojo.InspectItem;


public interface IInspectItemService extends IService<InspectItem> {
    Object list(InspectItem inspectItem);

    boolean add(InspectItem inspectItem);

    boolean batchdel(Integer[] ids);
}
