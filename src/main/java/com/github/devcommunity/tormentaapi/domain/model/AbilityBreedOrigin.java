package com.github.devcommunity.tormentaapi.domain.model;

import com.github.devcommunity.tormentaapi.domain.model.auditoria.Audit;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity(name = "ability_breed_origin")
public class AbilityBreedOrigin extends Audit implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    @Column(columnDefinition = "uuid", name = "abo_id")
    private UUID abo_id;

    @Type(type = "text")
    @Column(name = "abo_description")
    private String description;

    @ManyToOne
    @JoinColumn(name = "abo_character_id")
    private Character character;
}
