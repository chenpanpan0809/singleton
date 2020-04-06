package containSingleton;

/**
 * Created by panpan on 2020/4/6.
 */
public enum EnumSingleton {
    INSTANCE;

    private Object demo;



    public Object getDemo() {
        return demo;
    }

    public void setDemo(Object demo) {
        this.demo = demo;
    }

    public static EnumSingleton getInstance(){
        return INSTANCE;
    }
}
