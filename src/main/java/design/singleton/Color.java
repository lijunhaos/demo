package design.singleton;

/**
 * @author lijunhao
 * @date 2018/07/04
 */
enum Color {
    RED(1),GREEN(2),BLUE(3);
    private int code;
    Color(int code){
        this.code=code;
    }
    public int getCode(){
        return code;
    }

    public int msg;
}
