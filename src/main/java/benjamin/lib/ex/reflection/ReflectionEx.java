package benjamin.lib.ex.reflection;

import benjamin.lib.ex.AbstractEx;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by jisai on 2017/07/15.
 */
public final class ReflectionEx extends AbstractEx{
    /**
     * #参照：
     * <a href="https://my.oschina.net/gpzhang/blog/486743">
     * ClassLoader, Class.forNameの区別
     * </a>
     * @throws Throwable
     */
    public void doEx() {
        // Plane plane = new Plane("767", "white", 1500);
        Plane plane = null;
//        try {
//            plane = initByDefault();
//        } catch (Throwable throwable) {
//            throwable.printStackTrace();
//        }
//        plane.introduce();

        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        try {
            System.out.println("ClassLoader.loadClass->>>>");
            loader.loadClass("benjamin.lib.ex.reflection.Plane");
            // loader.loadClass("benjamin.lib.ex.reflection.Plane").getConstructor().newInstance();
            System.out.println("<<<<-ClassLoader.loadClass");

            System.out.println("Class.forName->>>>");
            // 测试ClassLoader#loadClass和和Class.forName的区别
            // Class.forName("benjamin.lib.ex.reflection.Plane");
            // 带参构造方法测试
            plane = (Plane)Class.forName("benjamin.lib.ex.reflection.Plane")
                    .getConstructor(String.class).newInstance("AAA");
            plane.introduce();
            System.out.println("<<<<-Class.forName");

            Class clazz = Class.forName("benjamin.lib.ex.reflection.Plane");
            Field brand = clazz.getDeclaredField("brand");
            brand.setAccessible(true);
            brand.set(plane, "BBB");
            plane.introduce();


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }
}
