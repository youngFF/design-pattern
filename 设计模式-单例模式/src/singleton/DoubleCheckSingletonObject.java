package singleton;

public class DoubleCheckSingletonObject {

    private static DoubleCheckSingletonObject instance;


    private DoubleCheckSingletonObject() {

    }


    public static DoubleCheckSingletonObject getInstance() {
        if (instance == null) {
            synchronized (DoubleCheckSingletonObject.class) {
                // 进行再一次判断是因为：其它线程可能已经初始化了 instance
                if (instance == null) {
                    instance = new DoubleCheckSingletonObject();
                }
            }
        }

        return instance ;
    }
}
