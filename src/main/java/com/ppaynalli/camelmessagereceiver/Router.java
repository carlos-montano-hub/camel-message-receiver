package com.ppaynalli.camelmessagereceiver;


import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class Router extends RouteBuilder {

        @Override
        public void configure() throws Exception {
            from("jms:first-timer").to("log:first-timer");
            from("jms:second").to("log:second");

        }

}
