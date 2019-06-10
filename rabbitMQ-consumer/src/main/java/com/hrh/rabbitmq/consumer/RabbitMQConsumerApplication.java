package com.hrh.rabbitmq.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @ProjectName: RabbitMQ
 * @Package: com.hrh.rabbitmq.provider
 * @ClassName: RabbitMQConsumerApplication
 * @Author: break
 * @Description:
 * @Date: 2019/6/6 0006 下午 21:16
 * @Version: 1.0
 */
@SpringBootApplication
public class RabbitMQConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(RabbitMQConsumerApplication.class,args);
    }
}
