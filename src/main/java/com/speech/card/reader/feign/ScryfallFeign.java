package com.speech.card.reader.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(value = "scryfall-api", url = "https://api.scryfall.com/")
public interface ScryfallFeign {

    @RequestMapping(method = RequestMethod.GET, value = "/cards/search?order=cmc&q=c%3Ared+pow%3D3", produces = "application/json")
    List<Object> getCardsByFilters();
}
