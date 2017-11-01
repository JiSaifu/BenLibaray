package benjamin.lib.ex.resource;

import benjamin.lib.ex.AbstractEx;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;

import java.io.IOException;
import java.io.InputStream;

public class ResourceEx extends AbstractEx {

    /**
     * Spring Resource接口及其实现的测试
     *
     * Spring的Resource接口及其实现类可以在脱离Spring框架的情况下使用，
     * 它比通过JDK访问资源的API更好用，更强大。
     *
     */
    @Override
    public void doEx() {
        String filePath = "E:\\Workspace\\IntelliJ\\BenLibrary\\src\\main\\resources\\resource.properties";
        Resource res1 = new FileSystemResource(filePath);
        Resource res2 = new ClassPathResource("resource.properties");
        Resource[] resArray;

        ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();

        try {
            InputStream ins1 = res1.getInputStream();
            InputStream ins2 = res2.getInputStream();

            System.out.println("res1: " + res1.getFilename());
            System.out.println("res2: " + res2.getFilename());

            // resArray = resolver.getResources("classpath:re?o*.properties");
            resArray = resolver.getResources("file:E:/Workspace/IntelliJ/**/SameName/*.txt");
            for(Resource res : resArray) {
                System.out.println(res.getDescription());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
