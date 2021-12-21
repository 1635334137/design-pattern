package com.lanzong.struct.composite;

/**
 * 组合模式：使用场景为树形结构
 * 把部分和整体的关系用树形结构表示，使客户端可以使用统一的处理方式处理部分和整体
 * 核心：抽象构件角色、叶子构件角色、容器构件角色（有容器特征，可包含子节点）
 * 天然形成递归
 */
public class Client {
    public static void main(String[] args) {
        AbstractFile f1,f2;
        f1 = new ImageFile("abc.jpg");
        f2 = new TextFile("hex.txt");

        Folder f3 = new Folder("我的收藏");
        f3.add(f1);
        f3.add(f2);

        f3.killVirus();
    }
}
