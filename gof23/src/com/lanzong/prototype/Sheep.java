package com.lanzong.prototype;


import java.util.Date;

public class Sheep implements Cloneable{
    private String name;
    private Date birthday;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object obj = super.clone();//clone()方法是Object类的方法，而不是Cloneable接口方法，clone()是navite的即调用本地C语言进行具体实现

        //实现深克隆
        Sheep sheep = (Sheep) obj;
        sheep.birthday = (Date) this.birthday.clone();//把对象的属性也进行克隆即可
        return obj;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}
