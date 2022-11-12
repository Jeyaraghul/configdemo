package com.rhlaab.configmap.property;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.Getter;
import lombok.Setter;

@Configuration
@ConfigurationProperties(prefix ="app")
@Getter
@Setter
public class ApplicationProperty {
    private String desc;
    private String name;
}
