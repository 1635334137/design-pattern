package com.lanzong.struct.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * 享元工厂类
 * 创建并管理享元对象，享元池一般设计成键值对
 */
public class ChessFlyWeightFactory {
    //享元池
    private static Map<String,ChessFlyWeight> map = new HashMap<>();

    public static ChessFlyWeight getChess(String color){
        if(map.get(color)!=null){//要什么颜色的棋子，有就直接返回
            return map.get(color);
        }else{//否则创建后返回
            ChessFlyWeight cfw = new ConcreteChess(color);
            map.put(color,cfw);
            return cfw;
        }
    }
}
