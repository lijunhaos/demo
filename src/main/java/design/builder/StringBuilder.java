package design.builder;

/**
 * @author lijunhao
 * @date 2018/07/06
 */
public class StringBuilder extends AbstractStringBuilder{
    public StringBuilder() {
        super(16);
    }

    @Override
    public String toString() {
        // Create a copy, don't share the array
        return new String(value, 0, count);
    }
}
