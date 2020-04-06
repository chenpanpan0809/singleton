package containSingleton;

import java.lang.reflect.Modifier;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by panpan on 2020/4/6.
 */
public class ContainSingleton {

    private static Map<String,Object> singletonMap = new ConcurrentHashMap<String,Object>();

    private ContainSingleton() throws Exception{
        if(ContainSingleton.class.getModifiers() !=0){
            throw new Exception("该构造方法不能私有化");
        }
    };

    public static ContainSingleton getInstance(String className){
        synchronized(ContainSingleton.class){
            if (!singletonMap.containsKey(className)){
                try {
                    Object o = Class.forName(className).newInstance();
                    singletonMap.put(className,o);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            return (ContainSingleton) singletonMap.get(className);
        }
    }
}
