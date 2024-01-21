package com.adozgen.learnjava.beans.qualifier;

import org.springframework.stereotype.Component;

@Component
public class SystemLogProcessor implements LogProcessor{
    @Override
    public void processLog(String log) {

    }
}
