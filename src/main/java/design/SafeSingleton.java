package design;

/**
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
