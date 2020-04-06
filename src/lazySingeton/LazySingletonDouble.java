package lazySingeton;

/**
 * Created by panpan on 2020/4/6.
 */
public class LazySingletonDouble {

    private static volatile LazySingletonDouble lazySingletonDouble =null;

    private LazySingletonDouble(){};

    public static LazySingletonDouble getInstance(){
        if (lazySingletonDouble == null){
            synchronized(LazySingletonDouble.class){
                if (lazySingletonDouble == null){
                    lazySingletonDouble = new LazySingletonDouble();
                }
            }
        }
        return lazySingletonDouble;
    }

}
