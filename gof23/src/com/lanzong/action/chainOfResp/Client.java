package com.lanzong.action.chainOfResp;

/**
 * 责任链模式
 * 责任链对象和相互关系可以通过数组集合进行存储
 */
public class Client {
    public static void main(String[] args) {
        Leader a = new Director("张三");
        Leader b = new Manager("李四");
        Leader c = new GeneralManager("王五");

        //组织责任链对象的关系
        a.setNextLeader(b);
        b.setNextLeader(c);

        //开始请假操作
        LeaveRequest req = new LeaveRequest("老六",9,"结婚！");
        a.handleRequest(req);
    }
}
