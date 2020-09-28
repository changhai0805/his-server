package com.neuedu.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.neuedu.pojo.RegistLevel;


public interface IRegistLevelService extends IService<RegistLevel> {
    Object list(RegistLevel registLevel);

    boolean batchdel(Integer[] ids);
}
