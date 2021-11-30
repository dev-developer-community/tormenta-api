package com.github.devcommunity.tormentaapi.domain.model;

import com.github.devcommunity.tormentaapi.domain.model.auditoria.Audit;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity(name = "skill")
public class Skill extends Audit implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    @Column(columnDefinition = "uuid", name = "ski_id")
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "ski_attribute_id")
    private Attribute attribute;

    @Column(name = "ski_description")
    private String description;

    @Column(name = "ski_training")
    private Boolean training;

    @Column(name = "ski_punishment")
    private Boolean punishment;
}
