package com.github.devcommunity.tormentaapi.domain.model;

import com.github.devcommunity.tormentaapi.domain.model.auditoria.Audit;
import com.github.devcommunity.tormentaapi.domain.model.enums.Atributos;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
@Table(name = "attribute")
public class Attribute extends Audit implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    @Column(columnDefinition = "uuid", name = "att_id")
    private UUID id;

    @Enumerated(EnumType.STRING)
    @Column(name = "att_description")
    private Atributos description;
}
