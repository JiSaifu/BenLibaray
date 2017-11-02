package benjamin.lib.ex.spring.ioc;

import benjamin.lib.ex.AbstractEx;
import benjamin.lib.ex.spring.ioc.events.MailSender;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EventEx extends AbstractEx {

    @Override
    public void doEx() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext(
                new String[]{"beans_c4.xml"}
        );
        MailSender msd = (MailSender)ctx.getBean("mailSender", MailSender.class);
        msd.sendMail( "aaa@bbb.ccc");
    }
}
