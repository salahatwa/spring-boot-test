package com.altafjava.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

  @GetMapping("/test")
  public String test() {
    return "Adding git pull yaaaaaaaaaaaaaahhhhhhhhhh ................................ _^_6";
  }
}
