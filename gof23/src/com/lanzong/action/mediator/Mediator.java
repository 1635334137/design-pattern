package com.lanzong.action.mediator;

//中介者接口
public interface Mediator {
    /**
     * 用于给部门注册，让中介者可以拿到部门的引用，去调用部门方法
     * @param dname 部门名称
     * @param d 部门
     */
    void register(String dname,Department d);

    /**
     * 向部门发出命令
     * @param dname 部门名称
     */
    void command(String dname);
}
