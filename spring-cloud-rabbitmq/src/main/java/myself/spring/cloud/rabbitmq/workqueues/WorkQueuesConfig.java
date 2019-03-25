package myself.spring.cloud.rabbitmq.workqueues;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WorkQueuesConfig {
    @Bean
    public Queue workqueue() {
        return new Queue("neo");
    }
}
