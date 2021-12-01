package com.github.devcommunity.tormentaapi.domain.model;

import com.github.devcommunity.tormentaapi.domain.model.audit.Audit;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity(name = "defense")
public class Defense extends Audit implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    @Column(columnDefinition = "uuid", name = "def_id")
    private UUID id;

    @Column(name = "def_total")
    private int total;

    @Column(name = "def_modifier")
    private int modifier;

    @Column(name = "def_armour_bonus")
    private int armourBonus;

    @Column(name = "def_others_bonus")
    private int othersBonus;

    @Column(name = "def_shield_bonus")
    private int shieldBonus;

    @ManyToOne
    @JoinColumn(name = "def_character_id")
    private Character character;
}
