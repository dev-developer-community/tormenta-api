package com.github.devcommunity.tormentaapi.domain.model;

import com.github.devcommunity.tormentaapi.domain.model.auditoria.Audit;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.UUID;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity(name = "character")
public class Character extends Audit implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    @Column(columnDefinition = "uuid", name = "cha_id")
    private UUID id;

    @Column(name = "cha_name")
    private String name;

    @Column(name = "cha_breed")
    private String breed;

    @Column(name = "cha_origin")
    private String origin;

    @Column(name = "cha_class")
    private String charcterClass;

    @Column(name = "cha_level")
    private int level;

    @Column(name = "cha_god")
    private String god;

    @Column(name = "cha_total_life")
    private int totalLife;

    @Column(name = "cha_total_mana")
    private int totalMana;

    @Column(name = "cha_current_life")
    private int currentLife;

    @Column(name = "cha_current_mana")
    private int currentMana;

    @Column(name = "cha_displacement")
    private int displacement;

    @Column(name = "cha_exp_points")
    private int expPoints;

    @ManyToOne
    @JoinColumn(name = "cha_people_id", nullable = false)
    private People people;

    @OneToMany(mappedBy = "character", fetch = FetchType.LAZY, cascade = CascadeType.REMOVE)
    private List<Item> item;

    @OneToMany(mappedBy = "character", fetch = FetchType.LAZY, cascade = CascadeType.REMOVE)
    private List<Magic> magic;

    @OneToMany(mappedBy = "character", fetch = FetchType.LAZY, cascade = CascadeType.REMOVE)
    private List<Inventory> inventory;

    @OneToMany(mappedBy = "character", fetch = FetchType.LAZY, cascade = CascadeType.REMOVE)
    private List<SkillClassPower> skillClassPower;

    @OneToMany(mappedBy = "character", fetch = FetchType.LAZY, cascade = CascadeType.REMOVE)
    private List<Annotation> notes;

    @OneToMany(mappedBy = "character", fetch = FetchType.LAZY, cascade = CascadeType.REMOVE)
    private List<History> history;

    @OneToMany(mappedBy = "character", fetch = FetchType.LAZY, cascade = CascadeType.REMOVE)
    private List<Attack> attack;

    @OneToMany(mappedBy = "character", fetch = FetchType.LAZY, cascade = CascadeType.REMOVE)
    private List<AbilityBreedOrigin> abilityBreedOrigin;

    @OneToMany(mappedBy = "character", fetch = FetchType.LAZY, cascade = CascadeType.REMOVE)
    private List<Proficiency> proficiency;

    @OneToMany(mappedBy = "character", fetch = FetchType.LAZY, cascade = CascadeType.REMOVE)
    private List<Defense> defense;
}
