package com.disignpattern.build.factorymethod;

/**
 * Created by liuzhengyang on 2015/4/22.
 */
public class SimpleNiceFactory implements FactoryMethod{

    public NiceOne createNiceOne() {
        return new LiuZhengyang();
    }
}
