package com.financial.menu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.financial.menu.dao")
public class FinancialMenuApplication {
  public static void main(String[] args) {
    SpringApplication.run(FinancialMenuApplication.class, args);
  }
}
