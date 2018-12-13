package com.financial.goods.config;

import java.util.Properties;
import com.github.pagehelper.PageInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MybatisConfiguration {
  @Bean
	public PageInterceptor pageInterceptor(){
		PageInterceptor pageInterceptor = new PageInterceptor();
    Properties p = new Properties();
    p.setProperty("offsetAsPageNum", "true");
    p.setProperty("rowBoundsWithCount", "true");
    p.setProperty("reasonable", "true");
    pageInterceptor.setProperties(p);
    return pageInterceptor;
	}
}
