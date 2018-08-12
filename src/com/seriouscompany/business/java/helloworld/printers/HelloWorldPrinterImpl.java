package com.seriouscompany.business.java.helloworld.printers;

import com.seriouscompany.business.java.helloworld.strategy.HelloWorldPrintingStrategy;
import com.seriouscompany.business.java.helloworld.string.HelloWorldString;

public class HelloWorldPrinterImpl implements HelloWorldPrinter {
    
    private final HelloWorldPrintingStrategy helloWorldPrintingStrategy;
    
    public HelloWorldPrinterImpl(HelloWorldPrintingStrategy helloWorldPrintingStrategy) {
        this.helloWorldPrintingStrategy = helloWorldPrintingStrategy;
    }

    @Override
    public void print(HelloWorldString helloWorldString) {
        helloWorldPrintingStrategy.print(helloWorldString);
    }
}
