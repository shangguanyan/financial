package com.financial.goods;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.financial.goods.dao")
public class FinancialGoodsApplication {
    public static void main(String[] args) {
        SpringApplication.run(FinancialGoodsApplication.class, args);
    }
}
