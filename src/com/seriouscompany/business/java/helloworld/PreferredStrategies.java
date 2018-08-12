package com.seriouscompany.business.java.helloworld;

import strategy.HelloWorldPrintingStrategy;
import strategy.HelloWorldPrintingStrategyImpl;

public final class PreferredStrategies {

    private static PreferredStrategies preferredStrategies = null;
    
    public static synchronized PreferredStrategies getInstance() {
        if (preferredStrategies == null) {
            preferredStrategies = new PreferredStrategies();
        }
        return preferredStrategies;
    }
    
    public HelloWorldPrintingStrategy getHelloWorldPrintingStrategy() {
        return new HelloWorldPrintingStrategyImpl();
    }
}
