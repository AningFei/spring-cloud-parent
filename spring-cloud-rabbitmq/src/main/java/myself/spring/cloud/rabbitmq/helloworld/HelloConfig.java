package myself.spring.cloud.rabbitmq.helloworld;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloConfig {
    @Bean
    public Queue helloQueue() {
        return new Queue("hello");
    }
}
