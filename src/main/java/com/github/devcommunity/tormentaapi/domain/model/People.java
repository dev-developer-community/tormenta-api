package com.github.devcommunity.tormentaapi.domain.model;

import com.github.devcommunity.tormentaapi.domain.model.audit.Audit;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.UUID;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity(name = "people")
public class People extends Audit implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    @Column(columnDefinition = "uuid", name = "peo_id")
    private UUID id;

    @Column(name = "peo_name", nullable = false)
    private String name;

    @Column(name = "peo_email", unique = true, nullable = false)
    private String email;

    @Column(name = "peo_password", nullable = false)
    private String password;

    @OneToMany(mappedBy = "people", fetch = FetchType.LAZY, cascade = CascadeType.REMOVE)
    private List<Character> characters;
}
