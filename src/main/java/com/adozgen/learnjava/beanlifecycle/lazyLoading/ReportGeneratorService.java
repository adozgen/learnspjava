package com.adozgen.learnjava.beanlifecycle.lazyLoading;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReportGeneratorService {

    private ReportGenerator reportGenerator;

    @Autowired
    public void setReportGenerator(ReportGenerator reportGenerator) {
        this.reportGenerator = reportGenerator;
    }
}
