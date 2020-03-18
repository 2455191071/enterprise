package com.csdj.enterprise;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author ASUS
 */
@SpringBootApplication
@MapperScan("com.csdj.enterprise.dao")
public class EnterpriseApplication {

    public static void main(String[] args) {
        SpringApplication.run(EnterpriseApplication.class, args);
    }

}
