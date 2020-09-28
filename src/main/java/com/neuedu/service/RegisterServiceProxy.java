package com.neuedu.service;

import com.neuedu.service.impl.RegisterServiceImpl;


public class RegisterServiceProxy extends RegisterServiceImpl implements IRegisterService {


    /**
     * com.neuedu.service.impl.*.update   在before之初，开启事务
     *
     * com.neuedu.service.impl.*.update   after，提交事务
     *
     * com.neuedu.service.impl.*.update   产生异常throwing，回滚事务
     *
     * @param checkApplyIds
     * @param inspectApplyIds
     * @return
     */
    @Override
    public boolean collectFee(Integer[] checkApplyIds, Integer[] inspectApplyIds) {


        //唱歌的方法
        try{
            //auto
            boolean success = super.collectFee(checkApplyIds, inspectApplyIds);
            //commit
        }catch(Exception ex){
            //回滚
        }


        //缴税
        //..............

        return false;
    }
}
