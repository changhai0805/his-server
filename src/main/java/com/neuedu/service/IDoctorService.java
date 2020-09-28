package com.neuedu.service;

import com.neuedu.pojo.Register;

import java.io.IOException;
import java.util.List;



public interface IDoctorService {

    List<Register> registList(String type,String token) throws IOException;

}
