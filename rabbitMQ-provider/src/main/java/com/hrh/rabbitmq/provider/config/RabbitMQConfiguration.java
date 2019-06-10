package com.hrh.rabbitmq.provider.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * @ProjectName: RabbitMQ
 * @Package: com.hrh.rabbitmq.provider.config
 * @ClassName: RabbitMQConfiguration
 * @Author: hrh
 * @Description:
 * @Date: 2019/6/6 0006 下午 14:55
 * @Version: 1.0
 */
@Configuration
public class RabbitMQConfiguration {
    @Bean
    public Queue queue() {
        return new Queue("rabbitMQ-provider");
    }
}
