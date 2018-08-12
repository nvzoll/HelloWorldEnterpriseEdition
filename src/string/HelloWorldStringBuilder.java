package string;

import constants.HelloWorldConstant;

public class HelloWorldStringBuilder implements Builder<HelloWorldString> {

    @Override
    public HelloWorldString build() {
        return new HelloWorldString(HelloWorldConstant.HELLO_WORLD_STRING_CONSTANT);
    }

}
