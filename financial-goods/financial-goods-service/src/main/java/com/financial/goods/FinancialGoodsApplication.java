package com.financial.goods;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class FinancialGoodsApplication {
    public static void main(String[] args) {
        SpringApplication.run(FinancialGoodsApplication.class, args);
    }
}
