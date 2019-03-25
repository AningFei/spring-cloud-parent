package myself.spring.cloud.rabbitmq.topics;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TopicsConfig {
    private final static String message = "topic.A";
    private final static String messages = "topic.B";

    //新建队列
    @Bean
    public Queue queueMessage() {
        return new Queue(message,true);
    }

    @Bean
    public Queue queueMessages() {
        return new Queue(messages);
    }

    //新建交换机
    @Bean
    public TopicExchange exchange() {
        return new TopicExchange("topicExchange");
    }

    //将队列绑定到交换机上(路由模式)
    @Bean
    Binding bindingExchangeMessage(Queue queueMessage, TopicExchange exchange) {
        return BindingBuilder.bind(queueMessage).to(exchange).with("topic.message");
    }
//将队列绑定到交换机上(topic模式)
    @Bean
    Binding bindingExchangeMessages(Queue queueMessages, TopicExchange exchange) {
        return BindingBuilder.bind(queueMessages).to(exchange).with("topic.#");
    }
}
