package singleton;

public class LazySingletonObject {

    private static LazySingletonObject instance ;



    private LazySingletonObject() {

    }


    public LazySingletonObject getInstance() {

        // 非线程安全
        if (instance == null) {
            instance = new LazySingletonObject();
        }

        return instance;
    }
}
