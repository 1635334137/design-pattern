package com.lanzong.action.observer.javaseobs;

import java.util.Observable;
import java.util.Observer;

//具体观察者
public class ObserverA implements Observer {

    private int myState;

    @Override
    public void update(Observable o, Object arg) {
        myState = ((ConcreteSubject)o).getState();
    }

    public int getMyState() {
        return myState;
    }
}
