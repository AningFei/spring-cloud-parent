package myself.spring.cloud.rabbitmq.workqueues;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "neo")
public class WorkQueuesReceiverTwo {
    @RabbitHandler
    public void process(String neo) {
        System.out.println("Receiver 2: " + neo);
    }
}
