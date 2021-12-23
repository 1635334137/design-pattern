package com.lanzong.action.observer.javaseobs;

/**
 * 使用JAVASE提供的java.util.Observable和java.util.Observer来实现观察者模式
 */
public class Client {
    public static void main(String[] args) {
        //创建目标对象
        ConcreteSubject subject = new ConcreteSubject();
        //创建观察者
        ObserverA obs1 = new ObserverA();
        ObserverA obs2 = new ObserverA();
        ObserverA obs3 = new ObserverA();
        //将三个观察者添加到目标对象的观察者容器中
        subject.addObserver(obs1);
        subject.addObserver(obs2);
        subject.addObserver(obs3);
        //改变subject状态
        subject.setState(20);
        //查看观察者状态是否改变
        System.out.println(obs1.getMyState());
        System.out.println(obs2.getMyState());
        System.out.println(obs3.getMyState());
    }
}
