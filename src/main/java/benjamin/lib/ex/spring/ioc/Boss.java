package benjamin.lib.ex.spring.ioc;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.*;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Boss {
    @Setter @Getter
    private Car car1;
    @Setter @Getter
    private Car car2;
    @Setter @Getter
    private Plane plane;

    @Setter @Getter
    private List<String> favorites;

    @Setter @Getter
    private Map<String, String> jobs;

    @Setter @Getter
    // Properties的键值对只能是字符串
    private Properties mails;
}
