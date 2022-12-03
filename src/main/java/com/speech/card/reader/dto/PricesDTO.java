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
public class PricesDTO implements Serializable {
    public Float  usd;
    public Float usd_foil;
    public Float usd_etched;
    public Float eur;
    public Float eur_foil;
    public Float tix;
}
