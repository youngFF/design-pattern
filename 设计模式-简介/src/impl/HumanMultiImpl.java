package impl;

import 接口隔离原则.Runnable;
import 接口隔离原则.Singable;
import 接口隔离原则.Sleepable;


/**
 * 当使用接口分离原则时，可以选择实现接口
 */
public class HumanMultiImpl implements Runnable, Singable, Sleepable {

    @Override
    public void run() {

    }

    @Override
    public void sleep() {

    }

    @Override
    public void sing() {

    }
}
