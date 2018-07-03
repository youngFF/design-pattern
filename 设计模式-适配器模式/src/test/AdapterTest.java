package test;

import model.Adapter;
import org.junit.Test;

public class AdapterTest {


    @Test
    public void test() {
        Adapter adapter = new Adapter();
        System.out.println(adapter.service());

    }
}
