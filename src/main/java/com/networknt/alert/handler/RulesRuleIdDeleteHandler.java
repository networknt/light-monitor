
package com.networknt.alert.handler;

import com.networknt.handler.LightHttpHandler;
import io.undertow.server.HttpServerExchange;
import io.undertow.util.HttpString;
import java.util.HashMap;
import java.util.Map;

public class RulesRuleIdDeleteHandler implements LightHttpHandler {
    @Override
    public void handleRequest(HttpServerExchange exchange) throws Exception {
        
            exchange.getResponseHeaders().add(new HttpString("Content-Type"), "application/json");
             exchange.getResponseSender().send("[{\"id\":1,\"name\":\"rule1\",\"type\":\"threshold\",\"min_events\":5,\"frequency\":\"1m\",\"timeframe\":\"2d\",\"search\":\"search one\",\"alerter\":\"post to Azure event hub\"}]");
        
    }
}
