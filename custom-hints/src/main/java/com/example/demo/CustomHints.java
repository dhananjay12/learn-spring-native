package com.example.demo;

import org.springframework.aot.context.bootstrap.generator.infrastructure.nativex.NativeConfigurationRegistry;
import org.springframework.nativex.AotOptions;
import org.springframework.nativex.type.NativeConfiguration;


public class CustomHints implements NativeConfiguration {

    @Override
    public boolean isValid(AotOptions aotOptions) {
        return true;
    }

    @Override
    public void computeHints(NativeConfigurationRegistry registry, AotOptions aotOptions) {
        NativeConfiguration.super.computeHints(registry, aotOptions);
    }
}
