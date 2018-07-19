package design.factory;

/**
 * 简单工厂（Simple Factory）
 *
 * 意图::在创建一个对象时不向客户暴露内部细节，并提供一个创建对象的通用接口。
 *
 * 类图::简单工厂不是设计模式，更像是一种编程习惯。它把实例化的操作单独放到一个类中，这个类就成为简单工厂类，让简单工厂类来决定应该用哪个具体子类来实例化。
 *
 * 这样做能把客户类和具体子类的实现解耦，客户类不再需要知道有哪些子类以及应当实例化哪个子类。
 * 因为客户类往往有多个，如果不使用简单工厂，所有的客户类都要知道所有子类的细节。
 * 而且一旦子类发生改变，例如增加子类，那么所有的客户类都要进行修改。
 *
 * 如果存在下面这种代码，就需要使用简单工厂将对象实例化的部分放到简单工厂中。
 *
 * @author lijunhao
 * @date 2018/07/05
 */
public class Client {
    /*public static void main(String[] args) {
        int type = 1;
        Product product;
        if (type == 1) {
            product = new ConcreteProduct1();
        } else if (type == 2) {
            product = new ConcreteProduct2();
        } else {
            product = new ConcreteProduct();
        }
    }*/

    public static void main(String[] args) {
        SimpleFactory simpleFactory = new SimpleFactory();
        Product product = simpleFactory.createProduct(1);

        System.out.println(product);
    }
}
