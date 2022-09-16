package com.example.auctiondiscovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class AuctionDiscoveryApplication {

    public static void main(String[] args) {
        SpringApplication.run(AuctionDiscoveryApplication.class, args);
    }

}
