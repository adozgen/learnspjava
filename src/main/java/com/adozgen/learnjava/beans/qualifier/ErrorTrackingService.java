package com.adozgen.learnjava.beans.qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class ErrorTrackingService {
    private final LogProcessor logProcessor;

    @Autowired
    public ErrorTrackingService(LogProcessor logProcessor) {
        this.logProcessor = logProcessor;
    }

    public void trackError(String errorLog) {
        logProcessor.processLog(errorLog);
    }
}
