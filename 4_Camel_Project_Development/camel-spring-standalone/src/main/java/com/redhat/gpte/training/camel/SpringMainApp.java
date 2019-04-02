package com.redhat.gpte.training.camel;

import org.apache.camel.spring.Main;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SpringMainApp {

  private static Logger logger = LoggerFactory.getLogger(SpringMainApp.class);

  public static void main(String[] args) throws Exception {

    // create a Main instance
    Main main = new Main();
    main.enableHangupSupport();
    main.setApplicationContextUri("META-INF/spring/spring-camel-context.xml");
    logger.info("Starting SpringMainApp");
    main.run();
  }

}
