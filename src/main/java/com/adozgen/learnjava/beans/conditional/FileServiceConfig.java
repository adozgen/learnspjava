package com.adozgen.learnjava.beans.conditional;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FileServiceConfig {
    @Bean
    @Conditional(WindowsCondition.class)
    public FileService windowsFileService(){
        return new WindowsFileService();
    }

    @Bean
    @Conditional(LinuxCondition.class)
    public FileService linuxFileService(){
        return new LinuxFileService();
    }
}
