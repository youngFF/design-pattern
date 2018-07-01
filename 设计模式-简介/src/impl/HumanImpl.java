package impl;

import 接口隔离原则.Human;

/**
 * 如果HumanImpl实现了Human接口之后，就必须实现Human里面的所有方法
 */
public class HumanImpl implements Human {

    @Override
    public void sing() {

    }

    @Override
    public void run() {

    }

    @Override
    public void sleep() {

    }
}
