package com.neuedu.service;

import com.neuedu.pojo.UmsUserRole;
import com.baomidou.mybatisplus.extension.service.IService;


public interface IUmsUserRoleService extends IService<UmsUserRole> {
     UmsUserRole getByUserId(Integer userId);
}
