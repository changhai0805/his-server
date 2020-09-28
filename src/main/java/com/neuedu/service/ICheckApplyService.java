package com.neuedu.service;

import com.neuedu.pojo.CheckApply;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;


public interface ICheckApplyService extends IService<CheckApply> {

    boolean save(Integer registerId, Integer[] itemId);

    List<CheckApply> list(Integer registerId);
}
