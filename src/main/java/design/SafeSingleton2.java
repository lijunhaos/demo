package design;

/**
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
