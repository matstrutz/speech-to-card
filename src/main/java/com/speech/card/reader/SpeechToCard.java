package com.speech.card.reader;

import com.speech.card.reader.service.CardService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignAutoConfiguration;

@EnableFeignClients
@SpringBootApplication
@RequiredArgsConstructor
@ImportAutoConfiguration({FeignAutoConfiguration.class})
public class SpeechToCard implements CommandLineRunner {

    private final CardService cardService;

    public static void main(String[] args) {
        SpringApplication.run(SpeechToCard.class, args);
    }

    @Override
    public void run(String ... args){
        cardService.findCard();
    }
}
