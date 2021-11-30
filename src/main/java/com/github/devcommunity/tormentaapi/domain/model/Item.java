package com.github.devcommunity.tormentaapi.domain.model;

import com.github.devcommunity.tormentaapi.domain.model.auditoria.Audit;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity(name = "item")
public class Item extends Audit implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    @Column(columnDefinition = "uuid", name = "ite_id")
    private UUID id;

    @Column(name = "ite_description")
    private String description;

    @Column(name = "ite_magic_description")
    private String magicDescription;

    @ManyToOne
    @JoinColumn(name = "ite_character_id")
    private Character character;
}
