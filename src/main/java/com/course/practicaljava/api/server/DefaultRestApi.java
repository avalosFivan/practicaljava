package com.course.practicaljava.api.server;

import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class DefaultRestApi {

  @RequestMapping("/welcome")
  public String welcome() {

    var text = StringUtils.join("Hello, ", "this is ", "Spring Boot ", "REST API");
    System.out.println(text);
    return "Welcome to spring boot";
  }
}
