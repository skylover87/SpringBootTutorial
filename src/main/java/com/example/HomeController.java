package com.example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by sengkai on 3/2/2017.
 */
@RestController
public class HomeController {

  @RequestMapping("/")
  public String home(){
    return "Hello Spring Boot!";
  }
}
