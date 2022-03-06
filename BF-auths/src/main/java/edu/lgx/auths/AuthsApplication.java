package edu.lgx.auths;

import bzu.lgx.utils.IdWorker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * @Author: LGX-LUCIFER
 * @Date: 2022-03-06 16:50
 * @Description:
 */
@SpringBootApplication
public class AuthsApplication {

    public static void main(String[] args) {
        SpringApplication.run(AuthsApplication.class, args);
    }

    @Bean
    public IdWorker idWorker(){
        return new IdWorker(1,1);
    }
}
