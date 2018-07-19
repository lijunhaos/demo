package design.singleton;

/**
 * 意图::确保一个类只有一个实例，并提供该实例的全局访问点。
 * 类图::使用一个私有构造函数、一个私有静态变量以及一个公有静态函数来实现。私有构造函数保证了不能通过构造函数来创建对象实例，只能通过公有静态函数返回唯一的私有静态变量。
 *
 * 懒汉式-线程安全
 *
 * 只需要对 getUniqueInstance() 方法加锁，那么在一个时间点只能有一个线程能够进入该方法，从而避免了对 uniqueInstance 进行多次实例化的问题。
 * 但是这样有一个问题，就是当一个线程进入该方法之后，其它线程试图进入该方法都必须等待，因此性能上有一定的损耗。
 *
 * @author lijunhao
 * @date 2018/06/06
 */
public class SafeSingleton {
    private static SafeSingleton ourInstance;

    private SafeSingleton() {
    }

    public static synchronized SafeSingleton getInstance() {
        if (null == ourInstance) {
            ourInstance = new SafeSingleton();
        }
        return ourInstance;
    }
}
