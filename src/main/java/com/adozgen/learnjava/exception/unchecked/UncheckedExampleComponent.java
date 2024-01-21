package com.adozgen.learnjava.exception.unchecked;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class UncheckedExampleComponent {
    @PostConstruct
    public void init() {
        UncheckedExamples uncheckedExamples = new UncheckedExamples();
        uncheckedExamples.arithmeticException();
    }
}
