package com.lanzong.struct.composite;

//叶子构件角色
public class ImageFile implements AbstractFile{

    private String name;

    public ImageFile(String name){
        this.name = name;
    }

    @Override
    public void killVirus() {
        System.out.println("图像文件："+name+"，进行查杀！");
    }
}
