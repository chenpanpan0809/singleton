package distorySingleton;

import containSingleton.ContainSingleton;
import containSingleton.EnumSingleton;
import lazyInClass.LazyInClassSingleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * Created by panpan on 2020/4/6.
 */
public class DistorySingleton {

    public static void main(String[] args) {
        Class<LazyInClassSingleton> lazyInClassSingletonClass = LazyInClassSingleton.class;
        try {
           /* Constructor declaredConstructors = lazyInClassSingletonClass.getDeclaredConstructor(null);
            declaredConstructors.setAccessible(true);
            System.out.println(declaredConstructors.newInstance());
            System.out.println(declaredConstructors.newInstance());*/

            //测试单例破坏容器
            Class<EnumSingleton> enumSingletonClass = EnumSingleton.class;
            Constructor<EnumSingleton> declaredConstructor = enumSingletonClass.getDeclaredConstructor(null);
            System.out.println(declaredConstructor.newInstance());
            System.out.println(declaredConstructor.newInstance());

            //测试反射破坏容器
           /* Class<ContainSingleton> containSingletonClass = ContainSingleton.class;
            Constructor<ContainSingleton> declaredConstructor = containSingletonClass.getDeclaredConstructor(null);
            declaredConstructor.setAccessible(true);
            System.out.println(declaredConstructor.newInstance());
            System.out.println(declaredConstructor.newInstance());*/

        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
