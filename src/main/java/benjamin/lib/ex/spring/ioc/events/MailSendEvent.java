package benjamin.lib.ex.spring.ioc.events;

import lombok.Getter;
import org.springframework.context.ApplicationContext;
import org.springframework.context.event.ApplicationContextEvent;

public class MailSendEvent extends ApplicationContextEvent {
    @Getter
    private String to;

    public MailSendEvent(ApplicationContext ctx, String to){
        super(ctx);
        this.to = to;
    }
}
