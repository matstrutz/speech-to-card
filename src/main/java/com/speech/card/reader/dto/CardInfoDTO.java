package com.speech.card.reader.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.ArrayList;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CardInfoDTO implements Serializable {
    public String object;
    public String id;
    public String oracle_id;
    public ArrayList<Integer> multiverse_ids;
    public Integer mtgo_id;
    public Integer mtgo_foil_id;
    public Integer tcgplayer_id;
    public Integer cardmarket_id;
    public String name;
    public String lang;
    public String released_at;
    public String uri;
    public String scryfall_uri;
    public String layout;
    public Boolean highres_image;
    public String image_status;
    public ImageUrlDTO image_uris;
    public String mana_cost;
    public Integer cmc;
    public String type_line;
    public String oracle_text;
    public ArrayList<Object> colors;
    public ArrayList<Object> color_identity;
    public ArrayList<Object> keywords;
    public ArrayList<String> produced_mana;
    public LegalitiesDTO legalities;
    public ArrayList<String> games;
    public Boolean reserved;
    public Boolean foil;
    public Boolean nonfoil;
    public ArrayList<String> finishes;
    public Boolean oversized;
    public Boolean promo;
    public Boolean reprInteger;
    public Boolean variation;
    public String set_id;
    public String set;
    public String set_name;
    public String set_type;
    public String set_uri;
    public String set_search_uri;
    public String scryfall_set_uri;
    public String rulings_uri;
    public String prIntegers_search_uri;
    public String collector_number;
    public Boolean digital;
    public String rarity;
    public String card_back_id;
    public String artist;
    public ArrayList<String> artist_ids;
    public String illustration_id;
    public String border_color;
    public String frame;
    public String security_stamp;
    public Boolean full_art;
    public Boolean textless;
    public Boolean booster;
    public Boolean story_spotlight;
    public Integer edhrec_rank;
    public PricesDTO prices;
    public RelatedUrlsDTO related_uris;
    public PurchaseUrlsDTO purchase_uris;
}
