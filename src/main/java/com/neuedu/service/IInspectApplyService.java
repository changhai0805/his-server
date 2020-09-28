package com.neuedu.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.neuedu.pojo.InspectApply;

import java.util.List;


public interface IInspectApplyService extends IService<InspectApply> {

    boolean save(Integer registerId, Integer[] itemId);

    List<InspectApply> list(Integer registerId);
}
