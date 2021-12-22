package com.lanzong.action.state;

/**
 * Context环境类
 * 房间对象
 */
public class HomeContext {

    //维护一个State对象
    private State state;

    /**
     * 修改状态的方法
     * @param state 要改变成哪种状态
     */
    public void setState(State state) {
        this.state = state;
        System.out.println("修改状态！");
        state.handle();//调用状态的行为
    }
}
