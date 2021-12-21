package com.lanzong.struct.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

//处理器
public class StarHandler implements InvocationHandler {

    //假设这个代理对象能代理多个明星，这里就不应该写真实角色了，而是传递接口
    //private RealStar realStar;

    private Star realStar;

    public StarHandler(Star realStar){
        this.realStar = realStar;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        method.invoke(realStar,args);
        return null;
    }
}
