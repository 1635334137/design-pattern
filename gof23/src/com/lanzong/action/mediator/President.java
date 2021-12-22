package com.lanzong.action.mediator;

import java.util.HashMap;
import java.util.Map;

//具体中介者实现
public class President implements Mediator{

    //用于存储部门的引用
    private Map<String,Department> map = new HashMap<>();

    @Override
    public void register(String dname, Department d) {
        map.put(dname,d);
    }

    /**
     * 中介者持有众多引用，根据名称执行同事的指定方法（可复杂化操作）
     * @param dname 部门名称
     */
    @Override
    public void command(String dname) {
        map.get(dname).selfAction();
    }
}
