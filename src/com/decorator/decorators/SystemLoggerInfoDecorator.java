package com.decorator.decorators;

import com.decorator.Logger;

public class SystemLoggerInfoDecorator extends  SystemLoggerDecorator{

    public SystemLoggerInfoDecorator(Logger sl) {
        super(sl);
    }

    @Override
    public void Log(String message){
        super.Log("[INFO]"+ message);
    }
}