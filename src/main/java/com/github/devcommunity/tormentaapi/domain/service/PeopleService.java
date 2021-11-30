package com.github.devcommunity.tormentaapi.domain.service;

import com.github.devcommunity.tormentaapi.domain.model.People;
import com.github.devcommunity.tormentaapi.domain.repository.PeopleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PeopleService {

    @Autowired
    private PeopleRepository peopleRepository;

    public void save(People people) {
        peopleRepository.save(people);
    }

}
