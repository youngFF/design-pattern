package singleton;

public class HugerySingletonObject {


    private static HugerySingletonObject instance = new HugerySingletonObject();



    // private constructor
    private HugerySingletonObject() {

    }

    public static HugerySingletonObject getInstance() {
        return instance ;
    }




}
