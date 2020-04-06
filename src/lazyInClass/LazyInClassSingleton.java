package lazyInClass;

/**
 * Created by panpan on 2020/4/6.
 */
public class LazyInClassSingleton {

    private LazyInClassSingleton(){};
    //静态内部类，类的加载机制解决线程安全问题
    private static class LazyInClass {
      private static final LazyInClassSingleton lazyInClassSingleton = new LazyInClassSingleton();
    }

    public static LazyInClassSingleton getInstance(){
        return LazyInClass.lazyInClassSingleton;
    }
}
