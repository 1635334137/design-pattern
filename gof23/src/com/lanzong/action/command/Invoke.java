package com.lanzong.action.command;

//命令发起者
public class Invoke {
    private Command command;

    public Invoke(Command command) {
        this.command = command;
    }

    //什么时候下达命令，如果命令接口的命令够多，可以选择要执行哪个命令，并且可以设计参数让谁执行这个命令
    void call(){
        command.execute();
    }
}
