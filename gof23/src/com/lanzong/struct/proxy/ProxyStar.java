package com.lanzong.struct.proxy;

//代理类，也实现了明星接口，对外表示明星有什么能力，但是代理类不能自己去具体做，不然要明星没用了
public class ProxyStar implements Star{

    private RealStar realStar;

    public ProxyStar(RealStar realStar){
        this.realStar = realStar;
    }

    @Override
    public void sing() {
        start();//可以自定义添加预备事情
        realStar.sing();//具体还得明星自己做
        end();//以及结束后的工作
    }

    public void end() {
        System.out.println("收尾结束");
    }

    public void start(){
        System.out.println("开始约谈");
    }
}
