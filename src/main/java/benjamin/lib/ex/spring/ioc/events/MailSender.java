package benjamin.lib.ex.spring.ioc.events;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class MailSender implements ApplicationContextAware {
    private ApplicationContext ctx;

    @Override
    public void setApplicationContext(ApplicationContext ctx) {
        this.ctx = ctx;
    }

    public void sendMail(String to) {
        System.out.println("Sending a mail ...");
        ctx.publishEvent(new MailSendEvent(ctx, to));
    }
}
