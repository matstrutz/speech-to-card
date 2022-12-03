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
public class PurchaseUrlsDTO implements Serializable {
    public String tcgplayer;
    public String cardmarket;
    public String cardhoarder;
}
