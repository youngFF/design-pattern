package 静态工厂;


/**
 * 静态工厂：这个工厂只能够生产对象A ， B ， C
 * 并且这个静态工厂生产的对象在以后就不能变了。。。。。。。。。。。。。what a pity
 */
public class StaticFactory {



    public static A getA() {
        return new A();
    }

    public static B getB() {
        return new B();
    }

    public static C getC() {
        return new C();
    }

    static class A {
    }

    static class B {
    }

    static class C {
    }
}

