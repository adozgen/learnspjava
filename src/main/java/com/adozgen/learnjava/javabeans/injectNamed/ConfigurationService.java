package com.adozgen.learnjava.javabeans.injectNamed;

import jakarta.inject.Inject;
import jakarta.inject.Named;
import org.springframework.stereotype.Service;

@Service
public class ConfigurationService {
    @Inject
    @Named("restConfiguration") // this is the name of the bean that we want to inject.
    private IConfiguration configuration;
}
