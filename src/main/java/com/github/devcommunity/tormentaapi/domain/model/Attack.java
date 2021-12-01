package com.github.devcommunity.tormentaapi.domain.model;

import com.github.devcommunity.tormentaapi.domain.model.audit.Audit;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity(name = "attack")
public class Attack extends Audit implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    @Column(columnDefinition = "uuid", name = "att_id")
    private UUID id;

    @Column(name = "att_description")
    private String description;

    @Column(name = "att_test_attack")
    private int testAttack;

    @Column(name = "att_damage")
    private String damage;

    @Column(name = "att_critical")
    private String critical;

    @Column(name = "att_type_damage")
    private String typeDamage;

    @Column(name = "att_range")
    private String range;

    @ManyToOne
    @JoinColumn(name = "att_character_id")
    private Character character;
}
