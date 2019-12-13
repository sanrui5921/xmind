package org.sunrain.study.springcloud.eureka.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class SpringcloudEurekaServerCluster01Application {
    public static void main(String[] args) {
        SpringApplication.run(SpringcloudEurekaServerCluster01Application.class, args);
    }
}
