package com.lanzong.struct.flyweight;

/**
 * 场景：有很多个完全相同或相似的对象，可以通过享元模式，节省内存
 * 内部状态：可以共享，不会随环境变化而改变
 * 外部状态：不可以共享，会随环境变化而改变
 *
 * 该例子：围棋的颜色，形状，大小是可以共享的为内部状态，位置是不可以共享的为外部状态
 */
public class Client {
    public static void main(String[] args) {
        ChessFlyWeight chess1 = ChessFlyWeightFactory.getChess("黑色");
        ChessFlyWeight chess2 = ChessFlyWeightFactory.getChess("黑色");
        System.out.println(chess1);
        System.out.println(chess2);

        System.out.println("增加外部状态的处理==========");
        chess1.display(new Coordinate(10,10));
        chess2.display(new Coordinate(20,20));
    }
}
