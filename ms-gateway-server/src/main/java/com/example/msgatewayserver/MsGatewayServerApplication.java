package com.example.msgatewayserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@SpringBootApplication
@EnableEurekaServer
public class MsGatewayServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(MsGatewayServerApplication.class, args);
    }

}
