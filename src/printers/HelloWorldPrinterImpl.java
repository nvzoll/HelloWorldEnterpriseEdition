package printers;

import strategy.HelloWorldPrintingStrategy;
import string.HelloWorldString;

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
