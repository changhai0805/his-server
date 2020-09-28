package com.neuedu.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.neuedu.pojo.UmsPermission;

import java.util.List;


public interface IUmsPermissionService extends IService<UmsPermission> {
    Object list(UmsPermission umsPermission);
    boolean add(UmsPermission umsPermission);

    List<UmsPermission> userPermissionList(Integer userId);

    List<UmsPermission> userPermissionListValidate(Integer userId);

}
