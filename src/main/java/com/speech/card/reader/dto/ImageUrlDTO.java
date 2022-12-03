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
public class ImageUrlDTO implements Serializable {
    public String small;
    public String normal;
    public String large;
    public String png;
    public String art_crop;
    public String border_crop;
}
