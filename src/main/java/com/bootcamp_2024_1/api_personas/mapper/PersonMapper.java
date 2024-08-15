package com.bootcamp_2024_1.api_personas.mapper;

import com.bootcamp_2024_1.api_personas.dto.PersonDto;
import com.bootcamp_2024_1.api_personas.persistency.entity.PersonEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PersonMapper {
    PersonDto personDtoToPersonEntity(PersonEntity person);
    PersonEntity personEntityToPersonDto(PersonDto person);
}
