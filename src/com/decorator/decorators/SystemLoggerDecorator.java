package com.decorator.decorators;

import com.decorator.Logger;

public class SystemLoggerDecorator implements Logger {

    final private Logger wrapper;

    public SystemLoggerDecorator(Logger sl) {
        this.wrapper=sl;
    }

    @Override
    public void Log(String message) {
        wrapper.Log(message);
    }
}
