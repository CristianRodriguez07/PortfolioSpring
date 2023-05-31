package com.example.portfoliocrisspring;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Proyectos {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    public String titulo;


    public String imagen;

    public String link;


    public Proyectos() {
    }
    public void getTitulo(String titulo) {
        this.titulo = titulo;
    }



    public void getImagen(String imagen) {
        this.imagen = imagen;
    }

    public void getLink(String link) {
        this.link = link;
    }


    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }


    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public void setLink(String link) {
        this.link = link;
    }
}


