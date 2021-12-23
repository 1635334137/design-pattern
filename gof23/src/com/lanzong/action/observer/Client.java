package com.lanzong.action.observer;

/**
 * 观察者模式：主要用于1：N的通知 广播机制
 * 当一个对象【目标对象subject】的状态变化时，需要及时的告知一系列对象【观察者observer】，令他们做出响应
 * 通知方式有推、拉。本例子介绍推
 */
public class Client {
    public static void main(String[] args) {
        //目标对象
        ConcreteSubject subject = new ConcreteSubject();

        //创建多个观察者
        ObserverA obs1 = new ObserverA();
        ObserverA obs2 = new ObserverA();
        ObserverA obs3 = new ObserverA();

        //将三个观察者添加到subject对象的观察者队伍中
        subject.registerObserver(obs1);
        subject.registerObserver(obs2);
        subject.registerObserver(obs3);

        subject.setState(2000);

        System.out.println(obs1.getMyState());
        System.out.println(obs2.getMyState());
        System.out.println(obs3.getMyState());
    }
}
