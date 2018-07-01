package 工厂方法或抽象工厂.factory;

import 工厂方法或抽象工厂.product.CProduct;
import 工厂方法或抽象工厂.product.Product;

public class CFactory extends AbstractFactory {
    @Override
    public Product getProduct() {
        return new CProduct();
    }
}
