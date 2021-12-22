package com.lanzong.action.chainOfResp;

public class GeneralManager extends Leader{

    public GeneralManager(String name) {
        super(name);
    }

    @Override
    public void handleRequest(LeaveRequest leaveRequest) {
        if (leaveRequest.getLeaveDays()<30){
            System.out.println("员工："+leaveRequest.getEmpName()+"请假，天数："+leaveRequest.getLeaveDays()+",理由："+leaveRequest.getReason());
            System.out.println("总经理："+this.name+"，审批通过！");
        }else{
            System.out.println("你不想干了？");
        }
    }
}
