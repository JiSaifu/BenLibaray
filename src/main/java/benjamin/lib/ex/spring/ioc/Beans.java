package benjamin.lib.ex.spring.ioc;

import benjamin.lib.ex.reflection.Plane;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Beans {

    @Bean(name = "plane")
    public Plane buildPlane() {
        Plane plane = new Plane();
        plane.setBrand("Air Bus");
        plane.setColor("white");

        return plane;
    }

}
