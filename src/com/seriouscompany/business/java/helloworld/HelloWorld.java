package com.seriouscompany.business.java.helloworld;

import com.seriouscompany.business.java.helloworld.printers.HelloWorldPrinter;
import com.seriouscompany.business.java.helloworld.printers.HelloWorldPrinterImpl;
import com.seriouscompany.business.java.helloworld.strategy.HelloWorldPrintingStrategy;
import com.seriouscompany.business.java.helloworld.string.HelloWorldString;
import com.seriouscompany.business.java.helloworld.string.HelloWorldStringBuilder;

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
