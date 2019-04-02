package com.redhat.gpte.training.camel;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.main.Main;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.redhat.gpte.training.camel.bean.MyBean;

public class CamelStandaloneApp {

  private static Logger logger = LoggerFactory.getLogger(CamelStandaloneApp.class);

  public static void main(String[] args) throws Exception {

    // create a Main instance
    Main main = new Main();
    main.enableHangupSupport();
    main.addRouteBuilder(new MyRouteBuilder());
    main.run();
  }

  private static class MyRouteBuilder extends RouteBuilder {

    @Override
    public void configure() throws Exception {
      from("timer://exercise?delay=2s&period=10s").routeId("# Timer Exercise #")
          .setBody(constant("Student")).bean(MyBean.class, "sayHello")
          .log(">> a Camel exercise - ${body}");
    }
  }

}
