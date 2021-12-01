package com.github.devcommunity.tormentaapi.domain.model.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Attributes {

    FORCA("FOR"),
    DESTREZA("DES"),
    CONSTITUICAO("CON"),
    INTELIGENCIA("INT"),
    SABEDORIA("SAB"),
    CARISMA("CAR");

    private final String description;
}
