package com.neuedu.dto;

import com.neuedu.pojo.CheckApply;
import com.neuedu.pojo.InspectApply;
import com.neuedu.pojo.Register;
import lombok.Data;

import java.util.List;


@Data
public class FeeDTO {

    private Register register;
    private List<CheckApply> checkApplyList;
    private List<InspectApply> inspectApplyList;




}
