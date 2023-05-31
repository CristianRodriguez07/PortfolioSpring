package com.example.portfoliocrisspring;

import jakarta.persistence.Entity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface HabilidadesRepository extends CrudRepository<Habilidades, Integer> {

}
