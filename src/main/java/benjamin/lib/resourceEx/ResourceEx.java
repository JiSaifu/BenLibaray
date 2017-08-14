package benjamin.lib.resourceEx;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import java.io.IOException;
import java.io.InputStream;

public class ResourceEx {


    public static void main(String[] args) {
        String filePath = "E:\\Workspace\\IntelliJ\\libarary\\target\\classes\\resource.properties";
        Resource res1 = new FileSystemResource(filePath);

        Resource res2 = new ClassPathResource("resource.properties");
        try {
            InputStream ins1 = res1.getInputStream();
            InputStream ins2 = res2.getInputStream();

            System.out.println("res1: " + res1.getFilename());
            System.out.println("res2: " + res2.getFilename());

        } catch (IOException e) {

        }

    }
}
