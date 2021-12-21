package com.lanzong.struct.composite;

import java.util.ArrayList;
import java.util.List;

//容器构件角色
public class Folder implements AbstractFile{

    private String name;
    private List<AbstractFile> files = new ArrayList<>();

    public Folder(String name){
        this.name = name;
    }

    public void add(AbstractFile file){
        files.add(file);
    }

    public void remove(AbstractFile file){
        files.remove(file);
    }

    public AbstractFile getChild(int index){
        return files.get(index);
    }

    @Override
    public void killVirus() {
        System.out.println("文件夹："+name+"，进行查杀！");
        for (AbstractFile file : files){
            file.killVirus();
        }
    }
}
