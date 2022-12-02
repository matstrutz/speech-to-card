package com.speech.card.reader.config;

import feign.codec.Decoder;
import feign.codec.Encoder;
import feign.form.spring.SpringFormEncoder;
import feign.jackson.JacksonDecoder;
import feign.jackson.JacksonEncoder;
import org.springframework.context.annotation.Bean;

public class FeignConfig {

    @Bean
    public Encoder feignEncoder() {
        return new SpringFormEncoder(new JacksonEncoder());
    }

    @Bean
    public Decoder feignDecoder() {
        return new JacksonDecoder();
    };
}
