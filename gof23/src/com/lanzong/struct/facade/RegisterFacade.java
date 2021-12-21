package com.lanzong.struct.facade;

//具体实现由该类负责，只提供给客户端一个方法调用
public class RegisterFacade {
    public void register(){
        //注册公司的步骤
        System.out.println("start");
        System.out.println("具体操作...");
        System.out.println("首先跟xxx公司打交道");
        System.out.println("其次跟xxx公司打交道");
        System.out.println("最后跟xxx公司打交道");
        System.out.println("end");
    }
}
