package com.lanzong.action.command;

/**
 * 命令模式：命令下达者和执行者解耦
 * 这种设计模式，可以方便的扩展业务。并在命令执行前后进行多种前置后置操作
 * 数据库的事务机制的底层实现
 */
public class Client {
    public static void main(String[] args) {
//        Invoke invoke = new Invoke(new ConcreteCommend(new Receiver()));
//        invoke.call();

        Command command = new ConcreteCommend(new Receiver());
        Invoke invoke = new Invoke(command);
        invoke.call();
    }
}
