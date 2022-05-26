package com.hhp.spring;

import com.hhp.spring.entity.Money;
import com.hhp.spring.service.impl.StoryMoneyServiceImpl;
import com.hhp.spring.service.impl.TestMoneyServiceImpl;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import java.util.List;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@MapperScan("com.hhp.spring.mapper")
public class SpringBootDemoApplication {

    public SpringBootDemoApplication(StoryMoneyServiceImpl storyIMoneyService, TestMoneyServiceImpl testMoneyService) {
        List<Money> testMoneyList = testMoneyService.list();
        System.out.println("Test Money List: " + testMoneyList);

        List<Money> storyMoneyList = storyIMoneyService.list();
        System.out.println("Story Money List: " + storyMoneyList);
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringBootDemoApplication.class, args);
    }

}
