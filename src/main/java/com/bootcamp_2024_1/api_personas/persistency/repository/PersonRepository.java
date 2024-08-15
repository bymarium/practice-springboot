package com.bootcamp_2024_1.api_personas.persistency.repository;

import com.bootcamp_2024_1.api_personas.persistency.entity.PersonEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<PersonEntity, Long> {

}
