package com.portfolio.one.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

//@EnableJpaAuditing// JPA Auditing 활성화 -> 원활한 test를 위해 @SpringBootApplication과 분리함, config/JpaConfig로 이동
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
