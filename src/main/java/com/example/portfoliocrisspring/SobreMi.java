package com.example.portfoliocrisspring;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class SobreMi {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    public String titulo;

    public String Descripcion;

    public String imagen;


}
