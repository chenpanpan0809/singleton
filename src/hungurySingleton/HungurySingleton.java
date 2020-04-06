package hungurySingleton;

/**
 * Created by panpan on 2020/4/6.
 */
public class HungurySingleton {

    private static final HungurySingleton HUNGURY_SINGLETON = new HungurySingleton();

    private HungurySingleton(){};

    public static HungurySingleton getInstance(){
        return HUNGURY_SINGLETON;
    }

}
