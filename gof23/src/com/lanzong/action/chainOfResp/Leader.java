package com.lanzong.action.chainOfResp;

/**
 * 抽象构件类
 */
public abstract class Leader {
    protected String name;
    protected Leader nextLeader;//责任链的后继对象

    public Leader(String name) {
        this.name = name;
    }

    public void setNextLeader(Leader nextLeader) {
        this.nextLeader = nextLeader;
    }

    //提供一个处理请假条的抽象方法，供责任链上的对象实现自己的处理方式
    public abstract void handleRequest(LeaveRequest leaveRequest);
}
