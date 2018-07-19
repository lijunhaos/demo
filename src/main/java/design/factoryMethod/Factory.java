package design.factoryMethod;

import design.factory.Product;

/**
 * @author lijunhao
 * @date 2018/07/05
 */
public abstract class Factory {

    abstract public Product factoryMethod();

    public void doSomething() {
        Product product = factoryMethod();
        // do something with the product
    }
}
