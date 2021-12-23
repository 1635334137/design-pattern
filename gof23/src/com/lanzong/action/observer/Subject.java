package com.lanzong.action.observer;

import java.util.ArrayList;
import java.util.List;

//主题对象基本构件
public class Subject {
    protected List<Observer> list = new ArrayList<>();

    public void registerObserver(Observer obs){
        list.add(obs);
    }
    public void removeObserver(Observer obs){
        list.remove(obs);
    }

    //通知所有观察者更新状态
    public void notifyAllObservers(){
        for (Observer obs : list){
            obs.update(this);
        }
    }
}
