package com.hkizilbulak.springaoparound;

import com.hkizilbulak.springaoparound.service.BankService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringAopAroundApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(SpringAopAroundApplication.class, args);
        BankService bankService = context.getBean(BankService.class);
        bankService.displayBalance("123");
    }

}
