package com.github.devcommunity.tormentaapi.interfaces.rest;

import com.github.devcommunity.tormentaapi.domain.model.People;
import com.github.devcommunity.tormentaapi.domain.service.PeopleService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@ApiOperation(value = "Registration of new users")
@ApiResponses(value = {
        @ApiResponse(code = 200, message = "Success method return")
})
@RestController
@RequestMapping("/api/v1/people")
public class PeopleController {

    @Autowired
    private PeopleService peopleService;

    @PostMapping(path = "/registration")
    public ResponseEntity<Void> registerPerson(@RequestBody People people) {
        peopleService.save(people);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
