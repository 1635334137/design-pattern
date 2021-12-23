package com.lanzong.action.observer;

//具体观察者
public class ObserverA implements Observer{

    private int myState;//myState跟目标对象的state一致

    public int getMyState() {
        return myState;
    }

    public void setMyState(int myState) {
        this.myState = myState;
    }

    @Override
    public void update(Subject subject) {
        myState = ((ConcreteSubject)subject).getState();
    }
}
