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
@Entity(name = "history")
public class History extends Audit implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    @Column(columnDefinition = "uuid", name = "his_id")
    private UUID id;

    @Type(type = "text")
    @Column(name = "his_description")
    private String description;

    @ManyToOne
    @JoinColumn(name = "his_character_id")
    private Character character;
}
