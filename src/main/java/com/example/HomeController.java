package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sk.demo.NotificationService;

/**
 * Created by sengkai on 3/2/2017.
 */
@RestController
public class HomeController {

  /**
   * There are a few ways to do Autowired.
   * 1) Field
   * 2) Constructor
   * 3) Setter Method
   */
  //Get Services
  @Autowired
  private NotificationService notificationService;

  @Value("${pageController.msg}")
  private String pageControllerMsg;

  @Value("${app.description}")
  private String appWelcomeDescription;

  @RequestMapping("/")
  public String home() {
    return appWelcomeDescription;
  }
}