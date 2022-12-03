package com.speech.card.reader.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RelatedUrlsDTO implements Serializable {
    public String gatherer;
    public String tcgplayer_infinite_articles;
    public String tcgplayer_infinite_decks;
    public String edhrec;
}
