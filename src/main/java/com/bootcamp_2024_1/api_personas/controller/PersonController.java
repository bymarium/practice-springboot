package com.bootcamp_2024_1.api_personas.controller;

import com.bootcamp_2024_1.api_personas.dto.PersonDto;
import com.bootcamp_2024_1.api_personas.mapper.PersonMapper;
import com.bootcamp_2024_1.api_personas.persistency.entity.PersonEntity;
import com.bootcamp_2024_1.api_personas.persistency.repository.PersonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/persons")
@RequiredArgsConstructor
public class PersonController {
    private final PersonRepository personRepository;
    private final PersonMapper personMapper;

//    public PersonController(PersonRepository personRepository) {
//        this.personRepository = personRepository;
//    }

    @GetMapping
    private List<PersonDto> getPerson() {
        return personRepository
                .findAll()
                .stream()
                .map(personEntity -> personMapper.personDtoToPersonEntity(personEntity))
                .collect(Collectors.toList());
    }

    @PostMapping
    private PersonDto createPerson(@RequestBody PersonDto person) {
        PersonEntity personEntity = this.personRepository.save(personMapper.personEntityToPersonDto(person));
        return personMapper.personDtoToPersonEntity(personEntity);
    }
}
