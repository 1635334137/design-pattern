package com.lanzong.struct.proxy;

/**
 * 静态代理模式
 * 代理对象由自己创建
 * 核心角色：抽象角色（代理角色和真实角色的公共对外方法）、真实角色、代理角色
 * 真实角色是真正的业务逻辑，代理角色将统一的流程控制放到代理中处理
 */
public class Client {
    public static void main(String[] args) {
        ProxyStar proxyStar = new ProxyStar(new RealStar());
        proxyStar.sing();
    }
}
