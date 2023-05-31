package com.example.portfoliocrisspring;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Habilidades {
    public String skill;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;


    public Habilidades() {
    }

    public Habilidades(String skill) {
        this.skill = skill;
    }


}



