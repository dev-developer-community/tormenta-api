package com.github.devcommunity.tormentaapi.domain.model.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Attributes {

    FORCE("FOR"),
    SKILL("DES"),
    CONSTITUTION("CON"),
    INTELLIGENCE("INT"),
    KNOWLEDGE("SAB"),
    CHARISMA("CAR");

    private final String description;
}
