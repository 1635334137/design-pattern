package com.lanzong.action.command;

//命令接口，方法可以设计成集合来存储，可处理多个命令
public interface Command {
    void execute();
}
