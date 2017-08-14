package benjamin.lib.classLoaderEx;

public class ClassLoaderEx
{
    public static void main(String[] args) {
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        // AppClassLoader负责装载Classpath路径下的jar包，它是ClassLoader的子类
        System.out.println("current loader:" + loader);
        // ExtClassLoader负责装在JRE扩展目录ext中的JAR包，它也是ClassLoader的子类
        System.out.println("parent loader:" + loader.getParent());
        // 根装载器不是ClassLoader的子类，它由C++编写，负责装载JRE核心类库
        System.out.println("grandparent loader:" + loader.getParent().getParent());
    }
}
