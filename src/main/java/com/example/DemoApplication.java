package com.example;

import com.example.configuration.SampleConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import java.util.Arrays;
import sk.demo.User;

@ComponentScan({"sk.demo", "com.example"})
@SpringBootApplication
@EnableConfigurationProperties
public class DemoApplication {

  @Bean
  public User user(){
    return new User("Seng Kai", "Cheah");
  }

  public static void main(String[] args) {
    //SpringApplication.run(DemoApplication.class, args);

    ApplicationContext ctx = SpringApplication.run(DemoApplication.class, args);

    SampleConfig sampleConfig = (SampleConfig) ctx.getBean("sampleConfig");
    System.out.println("Print Configuration :: "+sampleConfig.toString());

    String[] beanNames = ctx.getBeanDefinitionNames();
    Arrays.sort(beanNames);
    Arrays.stream(beanNames).forEach(System.out::println);

    System.out.println( ctx.getBean("user").toString());
  }
}
