package com.neuedu.service;

import com.neuedu.pojo.UmsPermission;
import com.neuedu.pojo.UmsRolePermission;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;


public interface IUmsRolePermissionService extends IService<UmsRolePermission> {
    List<UmsPermission> getPermission();
    UmsRolePermission getByRoleId(Integer roleId);
}
