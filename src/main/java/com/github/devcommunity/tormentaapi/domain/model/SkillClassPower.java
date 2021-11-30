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
@Entity(name = "habilidade_classe_poder")
public class SkillClassPower extends Audit implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    @Column(columnDefinition = "uuid", name = "hcp_id")
    private UUID id;

    @Type(type = "text")
    @Column(name = "hcp_descricao")
    private String hcp_descricao;

    @ManyToOne
    @JoinColumn(name = "hcp_personagem_id")
    private Character character;
}
