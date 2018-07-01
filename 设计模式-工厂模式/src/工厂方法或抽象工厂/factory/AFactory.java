package 工厂方法或抽象工厂.factory;

import 工厂方法或抽象工厂.product.AProduct;
import 工厂方法或抽象工厂.product.Product;

public class AFactory extends AbstractFactory {

    @Override
    public Product getProduct() {
        return new AProduct();
    }
}
