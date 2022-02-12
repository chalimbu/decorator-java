package com.decorator;

import com.decorator.decorators.*;

public class Main {
    public static void main(String[] args) {
        SystemLoggerDecorator errorWithDateLog = new SystemLoggerDecorator(
                new SystemLoggerErrorDecorator(
                        new SystemLoggerDateDecorator(
                                new SystemLogger()
                        )
                )
        );
        errorWithDateLog.Log("hello");
        SystemLoggerDecorator infoLog = new SystemLoggerDecorator(
                new SystemLoggerInfoDecorator(
                        new SystemLogger()
                )
        );
        infoLog.Log("some other");
    }
}
