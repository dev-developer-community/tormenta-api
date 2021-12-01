package com.github.devcommunity.tormentaapi.domain.model;

import com.github.devcommunity.tormentaapi.domain.model.audit.Audit;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity(name = "skill_class_power")
public class SkillClassPower extends Audit implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    @Column(columnDefinition = "uuid", name = "scp_id")
    private UUID id;

    @Type(type = "text")
    @Column(name = "scp_description")
    private String description;

    @ManyToOne
    @JoinColumn(name = "scp_character_id")
    private Character character;
}
