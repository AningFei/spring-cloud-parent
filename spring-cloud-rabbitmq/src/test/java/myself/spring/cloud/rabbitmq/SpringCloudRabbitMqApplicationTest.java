package myself.spring.cloud.rabbitmq;

import myself.spring.cloud.rabbitmq.helloworld.HelloSender;
import myself.spring.cloud.rabbitmq.publishsubscribe.PublishSubscribeSender;
import myself.spring.cloud.rabbitmq.topics.TopicsSender;
import myself.spring.cloud.rabbitmq.workqueues.WorkQueuesSender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringCloudRabbitMqApplicationTest {
    @Autowired
    private HelloSender helloSender;
    @Autowired
    private WorkQueuesSender workQueuesSender;
    @Autowired
    private PublishSubscribeSender  publishSubscribeSender;
    @Autowired
    private TopicsSender topicsSender;

    @Test
    public void hello() throws Exception {
        helloSender.send();
    }
    @Test
    public void workQueues() throws Exception {
        for (int i=0;i<100;i++){
            // Thread.sleep(10);
            workQueuesSender.send(i);
        }
    }
    @Test
    public  void  PublishSubscribe() throws  Exception{
        publishSubscribeSender.send();
    }

    @Test
    public  void  TopicsSenderTest() throws  Exception{
        topicsSender.send();
    }

    @Test
    public  void  TopicsSenderTestA()throws  Exception{
        topicsSender.send1();
    }

    @Test
    public  void  TopicsSenderTestB()throws  Exception{
        topicsSender.send2();
    }
}