package design;

/**
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
