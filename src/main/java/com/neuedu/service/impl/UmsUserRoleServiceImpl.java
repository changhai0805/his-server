package com.neuedu.service.impl;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.neuedu.pojo.UmsUserRole;
import com.neuedu.mapper.UmsUserRoleMapper;
import com.neuedu.service.IUmsUserRoleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;



@Service
public class UmsUserRoleServiceImpl extends ServiceImpl<UmsUserRoleMapper, UmsUserRole> implements IUmsUserRoleService {

    @Override
    public UmsUserRole getByUserId(Integer userId) {
        QueryWrapper<UmsUserRole> wrapper = new QueryWrapper<>();
        wrapper.eq("user_id",userId);
        return this.getOne(wrapper);
    }
}
