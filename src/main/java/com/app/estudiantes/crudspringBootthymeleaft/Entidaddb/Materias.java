package com.app.estudiantes.crudspringBootthymeleaft.Entidaddb;

import javax.persistence.*;

@Entity
@Table(name = "materias")

public class Materias {
    @Id
    private int idMateria;

    @Column(nullable = false ,length = 20)
    private  String nombre;

    @Column(nullable = false,length = 20)
    private String Docente;




    public Materias() {
    }

    public Materias(int idMateria, String nombre, String docente) {
        this.idMateria = idMateria;
        this.nombre = nombre;
        Docente = docente;
    }

    public int getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(int idMateria) {
        this.idMateria = idMateria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDocente() {
        return Docente;
    }

    public void setDocente(String docente) {
        Docente = docente;
    }
}
