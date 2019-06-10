package com.hrh.rabbitmq.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @ProjectName: RabbitMQ
 * @Package: com.hrh.rabbitmq.provider.config
 * @ClassName: RabbitProvider
 * @Author: break
 * @Description:
 * @Date: 2019/6/6 0006 下午 20:56
 * @Version: 1.0
 */
@Component
@RabbitListener(queues = "rabbitMQ-provider")
public class RabbitConsumer {
    @RabbitHandler
    public void process(String message) {
        System.out.println("Consumer: " + message);
    }
}
