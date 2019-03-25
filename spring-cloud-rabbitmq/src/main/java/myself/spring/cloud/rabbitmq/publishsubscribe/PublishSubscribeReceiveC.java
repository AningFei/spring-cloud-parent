package myself.spring.cloud.rabbitmq.publishsubscribe;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "fanout.C")
public class PublishSubscribeReceiveC {
    @RabbitHandler
    public void process(String message) {
        System.out.println("fanout Receiver C  : " + message);
    }
}
