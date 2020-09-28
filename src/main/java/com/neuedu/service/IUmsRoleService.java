package com.neuedu.service;

import com.neuedu.pojo.UmsRole;
import com.baomidou.mybatisplus.extension.service.IService;


public interface IUmsRoleService extends IService<UmsRole> {
    Object list(UmsRole umsRole);
    boolean add(UmsRole umsRole);
    boolean batchdel(Integer[] ids);
}
