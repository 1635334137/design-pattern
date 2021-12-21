package com.lanzong.prototype;

import java.util.Date;

/**
 * 克隆模式/原型模式
 * 差点因为自己的失误而误以为深克隆和浅克隆问题已经解决
 * 当源对象和克隆对象是浅克隆时，引用一个共同使用的对象时，一方修改另一方的也会改变
 */
public class Client {
    public static void main(String[] args) throws CloneNotSupportedException, InterruptedException {
        Date date = new Date();
        Sheep sheep = new Sheep();
        sheep.setName("多利羊");
        sheep.setBirthday(date);
        Sheep sheep2 = (Sheep) sheep.clone();

        System.out.println(sheep.getBirthday());
        System.out.println(sheep2.getBirthday());

        date.setTime(2353452353l);
        sheep.setBirthday(date);

        System.out.println(sheep.getBirthday());
        System.out.println(sheep2.getBirthday());

    }
}
