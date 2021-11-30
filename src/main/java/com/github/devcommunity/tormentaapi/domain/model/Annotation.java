package com.github.devcommunity.tormentaapi.domain.model;

import com.github.devcommunity.tormentaapi.domain.model.auditoria.Audit;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
@Table(name = "annotation")
public class Annotation extends Audit implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    @Column(columnDefinition = "uuid", name = "ann_id")
    private UUID id;

    @Type(type = "text")
    @Column(name = "ann_description")
    private String description;

    @ManyToOne
    @JoinColumn(name = "ann_character_id")
    private Character character;
}
