package lazySingeton;

import containSingleton.ContainSingleton;
import containSingleton.EnumSingleton;
import lazyInClass.LazyInClassSingleton;

import java.util.HashMap;


/**
 * Created by panpan on 2020/4/6.
 */
public class TestCommon {
    public static void main(String[] args) {
       /* System.out.println("单线程:"+LazySingleton.getInstance());
        System.out.println("单线程:"+LazySingleton.getInstance());*/

       /* new Thread(()->{
            System.out.println("多线程：当前线程"+Thread.currentThread().getName()+"："+LazySingleton.getInstance());
        },"t1").start();

        new Thread(()->{
            System.out.println("多线程：当前线程"+Thread.currentThread().getName()+"："+LazySingleton.getInstance());
        },"t2").start();*/


       /* new Thread(()->{
            System.out.println("多线程双重检查：当前线程"+Thread.currentThread().getName()+"："+LazySingletonDouble.getInstance());
        },"t1").start();

        new Thread(()->{
            System.out.println("多线程双重检查：当前线程"+Thread.currentThread().getName()+"："+LazySingletonDouble.getInstance());
        },"t2").start();*/

       /* new Thread(()->{
            System.out.println("多线程静态内部类：当前线程"+Thread.currentThread().getName()+"："+ LazyInClassSingleton.getInstance());
        },"t1").start();

        new Thread(()->{
            System.out.println("多线程静态内部类：当前线程"+Thread.currentThread().getName()+"："+LazyInClassSingleton.getInstance());
        },"t2").start();*/

        /*new Thread(()->{
            System.out.println("多线程容器单例：当前线程"+Thread.currentThread().getName()+"："+ContainSingleton.getInstance("containSingleton.ContainSingleton"));
        },"t1").start();

        new Thread(()->{
            System.out.println("多线程容器单例：当前线程"+Thread.currentThread().getName()+"："+ ContainSingleton.getInstance("containSingleton.ContainSingleton"));
        },"t2").start();*/

        //测试枚举类
        EnumSingleton.getInstance().setDemo(new Object().hashCode());
        System.out.println(EnumSingleton.getInstance().getDemo());
        System.out.println(EnumSingleton.getInstance().getDemo());

    }
}
