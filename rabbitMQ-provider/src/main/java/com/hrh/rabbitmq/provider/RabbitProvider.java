package com.hrh.rabbitmq.provider;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
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
public class RabbitProvider {
    @Autowired
    private AmqpTemplate amqpTemplate;

    public void send(String message) {
        amqpTemplate.convertAndSend("rabbitMQ-provider", message);
    }
}
