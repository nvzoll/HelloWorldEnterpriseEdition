package com.seriouscompany.business.java.helloworld.strategy;

import com.seriouscompany.business.java.helloworld.string.HelloWorldString;

public class HelloWorldPrintingStrategyImpl implements HelloWorldPrintingStrategy {

    @Override
    public void print(HelloWorldString helloWorldString) {
        System.out.println(helloWorldString);
    }

}
