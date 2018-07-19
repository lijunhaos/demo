package design.singleton;

/**
 *
 * 饿汉式-线程安全
 *
 * 线程不安全问题主要是由于 uniqueInstance 被实例化了多次，如果 uniqueInstance 采用直接实例化的话，就不会被实例化多次，也就不会产生线程不安全问题。但是直接实例化的方式也丢失了延迟实例化带来的节约资源的优势。
 *
 * @author lijunhao
 * @date 2018/06/06
 */
public class SafeSingleton2 {

    private static SafeSingleton2 uniqueInstance = new SafeSingleton2();

    private SafeSingleton2() {
    }

    public static SafeSingleton2 getUniqueInstance() {
        return uniqueInstance;
    }
}
