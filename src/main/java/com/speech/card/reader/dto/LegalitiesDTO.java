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
public class LegalitiesDTO implements Serializable {
    public String standard;
    public String future;
    public String historic;
    public String gladiator;
    public String pioneer;
    public String explorer;
    public String modern;
    public String legacy;
    public String pauper;
    public String vintage;
    public String penny;
    public String commander;
    public String brawl;
    public String historicbrawl;
    public String alchemy;
    public String paupercommander;
    public String duel;
    public String oldschool;
    public String premodern;
}
