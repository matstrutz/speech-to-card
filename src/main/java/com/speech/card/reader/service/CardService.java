package com.speech.card.reader.service;

import com.speech.card.reader.feign.ScryfallFeign;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CardService {

    private final ScryfallFeign feign;

    public void findCard(){
        feign.getCardsByFilters();
    }
}
