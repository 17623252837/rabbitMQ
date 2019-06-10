package com.hrh.rabbitmq;

import com.hrh.rabbitmq.consumer.RabbitMQConsumerApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = RabbitMQConsumerApplication.class)
public class RabbitmqApplicationTests {
    @Test
    public void contextLoads() {

    }

}
