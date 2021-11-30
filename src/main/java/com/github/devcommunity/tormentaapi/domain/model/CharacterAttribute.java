package com.github.devcommunity.tormentaapi.domain.model;

import com.github.devcommunity.tormentaapi.domain.model.auditoria.Audit;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity(name = "character_attribute")
public class CharacterAttribute extends Audit implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(columnDefinition = "uuid", name = "cha_id")
    private UUID id;

    @Column(name = "cha_total")
    private int total;

    @Column(name = "cha_modifier")
    private int modifier;

    @JoinColumn(name = "cha_character_id")
    private Character character;

    @JoinColumn(name = "cha_attribute_id")
    private Attribute attribute;
}
