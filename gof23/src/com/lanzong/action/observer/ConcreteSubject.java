package com.lanzong.action.observer;

//目标对象 （其实它也可以作为观察者来实现，既可以是发布者也可以是观察者）
public class ConcreteSubject extends Subject{
    private int state;

    public int getState() {
        return state;
    }

    //触发广播 ，当我的数据发生改变时，我要告诉所有人
    public void setState(int state) {
        this.state = state;
        //状态发生改变时通知所有观察者
        this.notifyAllObservers();
    }
}
