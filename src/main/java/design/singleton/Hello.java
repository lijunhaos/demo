package design.singleton;

/**
 * @author lijunhao
 * @date 2018/07/04
 */
public class Hello {
    public static void main(String[] args){
        Color color=Color.RED;
        int counter=10;
        while (counter-->0){
            switch (color){
                case RED:
                    System.out.println("Red");
                    color=Color.BLUE;
                    break;
                case BLUE:
                    System.out.println("Blue");
                    color=Color.GREEN;
                    break;
                case GREEN:
                    System.out.println("Green");
                    color=Color.RED;
                    break;
            }
        }
    }
}
