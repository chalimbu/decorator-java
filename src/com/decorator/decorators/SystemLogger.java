package com.decorator.decorators;

import com.decorator.Logger;

public class SystemLogger implements Logger {

    @Override
    public void Log(String message) {
        System.out.println(message);
    }
}
