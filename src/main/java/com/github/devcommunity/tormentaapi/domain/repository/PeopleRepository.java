package com.github.devcommunity.tormentaapi.domain.repository;

import com.github.devcommunity.tormentaapi.domain.model.People;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PeopleRepository extends JpaRepository<People, Long> {

}
