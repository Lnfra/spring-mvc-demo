package com.luv2code.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {

  //controller method to show the HTML form
  @RequestMapping("/showForm")
  public String showForm() {
    return "helloworld-form";
  }
  
  //controller method to process the HTML form
}