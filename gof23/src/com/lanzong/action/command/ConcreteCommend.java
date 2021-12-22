package com.lanzong.action.command;

//具体命令要如何操作的实现类（这个具体实现类可以很复杂化）
public class ConcreteCommend implements Command{

    //持有命令真正执行者的引用
    private Receiver receiver;

    public ConcreteCommend(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.action();
    }
}
