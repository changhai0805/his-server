package com.neuedu.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.neuedu.pojo.UmsUser;

import javax.servlet.http.HttpServletRequest;


public interface IUmsUserService extends IService<UmsUser> {

    public String token(UmsUser user) throws JsonProcessingException;


    Object list(UmsUser umsUser);
    boolean add(UmsUser umsUser);
    boolean batchdel(Integer[] ids);

    boolean logout(HttpServletRequest request);
}
