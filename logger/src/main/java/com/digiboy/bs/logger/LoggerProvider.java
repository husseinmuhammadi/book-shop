package com.digiboy.bs.logger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InjectionPoint;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.core.MethodParameter;

import java.lang.reflect.Field;

import static java.util.Optional.ofNullable;

@Configuration
public class LoggerProvider {
    @Bean
    @Scope("prototype")
    public Logger getLogger(final InjectionPoint ip) {
        return LoggerFactory.getLogger(ofNullable(ip.getMethodParameter())
                .<Class>map(MethodParameter::getContainingClass)
                .orElseGet(() -> ofNullable(ip.getField())
                        .map(Field::getDeclaringClass)
                        .orElseThrow(IllegalArgumentException::new)
                )
        );
    }
}
