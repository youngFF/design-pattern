package 工厂方法或抽象工厂.factory;

import 工厂方法或抽象工厂.product.BProduct;
import 工厂方法或抽象工厂.product.Product;

public class BFactory extends AbstractFactory {

    @Override
    public Product getProduct() {
        return new BProduct();
    }
}
