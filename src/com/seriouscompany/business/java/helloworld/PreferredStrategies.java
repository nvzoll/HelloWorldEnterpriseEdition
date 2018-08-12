package com.seriouscompany.business.java.helloworld;

import com.seriouscompany.business.java.helloworld.strategy.HelloWorldPrintingStrategy;
import com.seriouscompany.business.java.helloworld.strategy.HelloWorldPrintingStrategyImpl;

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
