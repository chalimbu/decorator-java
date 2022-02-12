package com.decorator.decorators;


import com.decorator.Logger;

import java.time.LocalDateTime;

public class SystemLoggerDateDecorator extends  SystemLoggerDecorator{

    public SystemLoggerDateDecorator(Logger sl) {
        super(sl);
    }



    @Override
    public void Log(String message){
        super.Log(LocalDateTime.now().toString()+ message);
    }
}