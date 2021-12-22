package com.lanzong.action.memento;

/**
 * 备忘录模式
 * 核心：保存某个对象内部状态的拷贝，这样以后可以将该对象恢复到原先的状态
 * 结构：源发器（内部状态）、备忘录（拷贝）、负责人（管理备忘录）
 * 应用场景：悔棋、撤销、历史记录等操作
 */
public class Client {
    public static void main(String[] args) {
        //管理备忘录（负责人）
        CareTaker taker = new CareTaker();

        //数据
        Emp emp = new Emp("拉弄",18,900);

        //备份一次，具体备份操作在emp中进行，emp中new了一个备忘录对象，然后交给负责人管理
        taker.setMemento(emp.memento());

        //修改数据
        emp.setAge(29);

        //恢复到该备忘录的状态，当然如果taker定义的是数组，则可以存储多个备忘录，选择一个进行恢复都可以
        emp.recovery(taker.getMemento());
    }
}
