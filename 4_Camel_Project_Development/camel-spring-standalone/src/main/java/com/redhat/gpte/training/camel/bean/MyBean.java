package com.redhat.gpte.training.camel.bean;

import org.apache.camel.Body;

public class MyBean {
  public String sayHello(@Body String to) {
    return String.format("Hello : %s", to);
  }
}
