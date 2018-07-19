package design.singleton;

/**
 * 双重校验锁-线程安全
 *
 * uniqueInstance 只需要被实例化一次，之后就可以直接使用了。加锁操作只需要对实例化那部分的代码进行。也就是说，只有当 uniqueInstance 没有被实例化时，才需要进行加锁。
 * 双重校验锁先判断 uniqueInstance 是否已经被实例化，如果没有被实例化，那么才对实例化语句进行加锁。
 *
 * 考虑下面的实现，也就是只使用了一个 if 语句。在 uniqueInstance == null 的情况下，如果两个线程同时执行 if 语句，那么两个线程就会同时进入 if 语句块内。
 * 虽然在 if 语句块内有加锁操作，但是两个线程都会执行 uniqueInstance = new Singleton(); 这条语句，只是先后的问题，也就是说会进行两次实例化，从而产生了两个实例。因此必须使用双重校验锁，也就是需要使用两个 if 语句。
 *
 * if (uniqueInstance == null) {
 *      synchronized (Singleton.class) {
 *          uniqueInstance = new Singleton();
 *      }
 * }
 *
 *
 * uniqueInstance 采用 volatile 关键字修饰也是很有必要的。uniqueInstance = new Singleton(); 这段代码其实是分为三步执行。
 *      1. 分配内存空间
 *      2. 初始化对象
 *      3. 将 uniqueInstance 指向分配的内存地址
 *
 * 但是由于 JVM 具有指令重排的特性，有可能执行顺序变为了 1>3>2，这在单线程情况下自然是没有问题。但如果是多线程下，有可能获得是一个还没有被初始化的实例，以致于程序出错。
 * 使用 volatile 可以禁止 JVM 的指令重排，保证在多线程环境下也能正常运行。
 *
 *
 * @author lijunhao
 * @date 2018/07/04
 */
public class DoubleSafeSingleton {
    private volatile static DoubleSafeSingleton uniqueInstance;

    private DoubleSafeSingleton() {
    }

    public static DoubleSafeSingleton getUniqueInstance() {
        if (uniqueInstance == null) {
            synchronized (DoubleSafeSingleton.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new DoubleSafeSingleton();
                }
            }
        }
        return uniqueInstance;
    }
}
