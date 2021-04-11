
  package com.dailycodebuffer.cloudgateway;
  
  import org.springframework.web.bind.annotation.GetMapping; import
  org.springframework.web.bind.annotation.RestController;
  
  @RestController public class FallBackMethodController {
  
  
  @GetMapping("/userServiceFallBack") public String userServiceFallBackMethod()
  { return " User Serivce is down , plese mind your work"; }
  
  @GetMapping("/departmentServiceFallBack") public String
  departmentServiceFallBackMethod() { return
  " Department Serivce is down , plese mind your work"; }
  
  }
 