package com.speech.card.reader.feign;

import com.speech.card.reader.config.FeignConfig;
import com.speech.card.reader.dto.AutoCompleteListDTO;
import com.speech.card.reader.dto.CardInfoDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(value = "scryfall-api", url = "https://api.scryfall.com", configuration = FeignConfig.class)
public interface ScryfallFeign {

    @GetMapping(value = "/cards/search", consumes = MediaType.APPLICATION_JSON_VALUE)
    List<CardInfoDTO> getCardsByFilters(@RequestParam(value = "order") String order,
                                        @RequestParam(value = "q") String q);

    @GetMapping(value = "/cards/named", consumes = MediaType.APPLICATION_JSON_VALUE)
    CardInfoDTO getExactCard(@RequestParam(value = "fuzzy") String fuzzy);

    @GetMapping(value = "/cards/autocomplete", consumes = MediaType.APPLICATION_JSON_VALUE)
    AutoCompleteListDTO getAutoCompleteList(@RequestParam(value = "q") String q);
}