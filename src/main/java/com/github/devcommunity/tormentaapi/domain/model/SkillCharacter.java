package com.github.devcommunity.tormentaapi.domain.model;

import com.github.devcommunity.tormentaapi.domain.model.audit.Audit;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity(name = "skill_character")
public class SkillCharacter extends Audit implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    @Column(columnDefinition = "uuid", name = "skc_id")
    private UUID id;

    @Column(name = "skc_level_bonus")
    private int levelBonus;

    @Column(name = "skc_bonus_others")
    private int bonusOthers;

    @Column(name = "skc_training_bonus")
    private int trainingBonus;

    @JoinColumn(name = "skc_character_id")
    private Character character;

    @JoinColumn(name = "skc_skill_id")
    private Skill skill;
}
