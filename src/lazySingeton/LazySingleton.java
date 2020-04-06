package lazySingeton;

/**
 * Created by panpan on 2020/4/6.
 */
public class LazySingleton {

    private static  LazySingleton lazySingleton = null;

    private LazySingleton(){};

    public static LazySingleton getInstance(){
        if (lazySingleton == null){
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }

}
