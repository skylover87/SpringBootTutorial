package com.example;

import com.example.configuration.DataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by sengkai on 3/7/2017.
 */
@RestController
public class ProfileController {

  @Value("${spring.profiles.active}")
  private String environment;

  @Value("${msg}")
  private String msg;

  @RequestMapping("/env")
  public String start(){
    return environment+" >>> [msg] :: "+msg;
  }

  public static void main(String[] args){
    ApplicationContext ctx = SpringApplication.run(DemoApplication.class, args);

    DataSource dataSource = (DataSource) ctx.getBean("datasource");
    System.out.println("Print Configuration :: "+dataSource.toString());
  }
}
