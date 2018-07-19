package lambda;

import java.awt.event.ActionListener;
import java.util.function.BinaryOperator;

/**
 * @author lijunhao
 * @date 2018/07/06
 */
public class test {
    Runnable noArguments = () -> System.out.println("Hello World");

    ActionListener oneArgument = event -> System.out.println("Hello World");

    Runnable multiStatement = () -> {
        System.out.print("Hello");
        System.out.println(" World");
    };

    BinaryOperator<Long> add = (x, y) -> x + y;

    BinaryOperator<Long> addExplicit = (Long x, Long y) -> x + y;
}
