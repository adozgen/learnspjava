package com.adozgen.learnjava.beans.qualifier.custom;

import org.springframework.beans.factory.annotation.Qualifier;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Qualifier
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.METHOD, ElementType.TYPE, ElementType.PARAMETER})
public @interface CommunicationChannel {
    ChannelType value();

    enum ChannelType {
        EMAIL, SMS, PUSH_NOTIFICATION
    }
}

