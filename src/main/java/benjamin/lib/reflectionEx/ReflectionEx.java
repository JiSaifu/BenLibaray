package benjamin.lib.reflectionEx;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * Created by jisai on 2017/07/15.
 */
public class ReflectionEx {
    public static void main(String[] args) throws Throwable {
        // Plane plane = new Plane("767", "white", 1500);
        Plane plane = initByDefault();
        plane.introduce();

        System.out.println("ClassLoader.loadClass->>>>");
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        loader.loadClass("benjamin.lib.reflectionEx.Plane").getConstructor().newInstance();
        System.out.println("<<<<-ClassLoader.loadClass");

        System.out.println("Class.forName->>>>");
        Class.forName("benjamin.lib.reflectionEx.Plane").getConstructor().newInstance();
        System.out.println("<<<<-Class.forName");

    }

    public static Plane initByDefault() throws Throwable
    {
        try {
            ClassLoader loader = Thread.currentThread().getContextClassLoader();
            //Class clazz = Class.forName("benjamin.lib.reflectionEx.Plane");
            Class clazz = loader.loadClass("benjamin.lib.reflectionEx.Plane");

            Constructor cons = clazz.getConstructor((Class[]) null);
            Plane plane = (Plane) cons.newInstance();
            // Plane plane = (Plane) clazz.newInstance();

            Method setBrand = clazz.getMethod("setBrand", String.class);
            setBrand.invoke(plane,"Mini");

            Method setColor = clazz.getMethod("setColor", String.class);
            setColor.invoke(plane,"black");

            Method setMaxSpeed = clazz.getMethod("setMaxSpeed", Integer.TYPE);
            setMaxSpeed.invoke(plane,180);

            return plane;
        }catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
}
