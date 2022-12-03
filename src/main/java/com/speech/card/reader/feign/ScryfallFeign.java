package com.speech.card.reader.feign;

import com.speech.card.reader.config.FeignConfig;
import com.speech.card.reader.dto.CardInfoDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "scryfall-api", url = "https://api.scryfall.com", configuration = FeignConfig.class)
public interface ScryfallFeign {

    @GetMapping(value = "cards/multiverse/409574", consumes = MediaType.APPLICATION_JSON_VALUE)
    CardInfoDTO getCardsByFilters();
}
