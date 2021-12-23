package com.lanzong.action.observer;

//观察者抽象接口
public interface Observer {
    //哪个主题发生变化
    void update(Subject subject);
}
