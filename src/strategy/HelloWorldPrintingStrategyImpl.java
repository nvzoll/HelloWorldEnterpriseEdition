package strategy;

import string.HelloWorldString;

public class HelloWorldPrintingStrategyImpl implements HelloWorldPrintingStrategy {

    @Override
    public void print(HelloWorldString helloWorldString) {
        System.out.println(helloWorldString);
    }

}
