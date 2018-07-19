package design.singleton;

/**
 * 意图::确保一个类只有一个实例，并提供该实例的全局访问点。
 * 类图::使用一个私有构造函数、一个私有静态变量以及一个公有静态函数来实现。私有构造函数保证了不能通过构造函数来创建对象实例，只能通过公有静态函数返回唯一的私有静态变量。
 *
 * 懒汉式-线程不安全
 *
 * 以下实现中，私有静态变量 uniqueInstance 被延迟化实例化，这样做的好处是，如果没有用到该类，那么就不会实例化 uniqueInstance，从而节约资源。
 * 这个实现在多线程环境下是不安全的，如果多个线程能够同时进入 if (uniqueInstance == null) ，并且此时 uniqueInstance 为 null，那么多个线程会执行 uniqueInstance = new Singleton(); 语句，这将导致多次实例化 uniqueInstance。
 *
 * @author lijunhao
 * @date 2018/06/06
 */
public class UnsafeSingleton {
    private static UnsafeSingleton ourInstance;

    private UnsafeSingleton() {
    }

    public static UnsafeSingleton getInstance() {
        if (null == ourInstance) {
            ourInstance = new UnsafeSingleton();
        }
        return ourInstance;
    }
}
