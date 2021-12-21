package com.lanzong.struct.adapter;

/**
 * 适配器模式
 * 角色：目标接口Target、需要适配的类Adaptee、适配器Adapter
 */
public class Client {
    public static void main(String[] args) {
        Notebook notebook = new Notebook();
        notebook.UsbInterface(new Adapter(new Adaptee()));
    }
}
