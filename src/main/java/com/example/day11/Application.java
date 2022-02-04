package com.example.day11;

import com.example.day11.bean.SingletonBean;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@Slf4j
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(Application.class, args);
//        SingletonBean singletonBean1 = context.getBean(SingletonBean.class);
//        log.info("Bean1:{}", singletonBean1);
//        singletonBean1.setNum1(0);
//        singletonBean1.setNum2(1);
//
//        SingletonBean singletonBean2 = context.getBean(SingletonBean.class);
//        log.info("Bean2 : {}", singletonBean2);
//        log.info("Num1: {}", singletonBean2.getNum1());
//        log.info("Num2: {}", singletonBean2.getNum2());
    }
}