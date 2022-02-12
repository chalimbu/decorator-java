package com.decorator.decorators;

import com.decorator.Logger;

public class SystemLoggerErrorDecorator extends  SystemLoggerDecorator{

    public SystemLoggerErrorDecorator(Logger sl) {
        super(sl);
    }

    @Override
    public void Log(String message){
        super.Log("[ERROR]"+ message);
    }
}
