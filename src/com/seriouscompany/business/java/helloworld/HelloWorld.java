package com.seriouscompany.business.java.helloworld;

import printers.HelloWorldPrinter;
import printers.HelloWorldPrinterImpl;
import strategy.HelloWorldPrintingStrategy;
import string.HelloWorldString;
import string.HelloWorldStringBuilder;

public class HelloWorld {

    public static void main(String[] args) {
        final HelloWorld helloWorld = new HelloWorld();
        helloWorld.doIt();
    }
    
    private void doIt() {
        final PreferredStrategies preferredStrategies = PreferredStrategies.getInstance();
        HelloWorldPrintingStrategy helloWorldPrintingStrategy = preferredStrategies.getHelloWorldPrintingStrategy();
        final HelloWorldPrinter helloWorldPrinter = new HelloWorldPrinterImpl(helloWorldPrintingStrategy);
        final HelloWorldStringBuilder helloWorldStringBuilder = new HelloWorldStringBuilder();
        HelloWorldString helloWorldString = helloWorldStringBuilder.build();
        helloWorldPrinter.print(helloWorldString);
    }
}
