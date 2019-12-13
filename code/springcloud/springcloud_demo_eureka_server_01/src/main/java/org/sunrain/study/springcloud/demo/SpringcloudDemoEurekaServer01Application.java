package org.sunrain.study.springcloud.springcloud_demo_eureka_server_01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableEurekaServer
@SpringBootApplication
public class SpringcloudDemoEurekaServer01Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudDemoEurekaServer01Application.class, args);
	}

}
