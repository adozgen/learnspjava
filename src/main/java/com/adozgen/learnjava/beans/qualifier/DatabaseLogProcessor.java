package com.adozgen.learnjava.beans.qualifier;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class DatabaseLogProcessor implements LogProcessor
{
    @Override
    public void processLog(String log) {

    }
}
