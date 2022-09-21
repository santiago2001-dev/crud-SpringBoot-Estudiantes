package com.app.estudiantes.crudspringBootthymeleaft.Entidaddb;

import javax.persistence.*;

@Entity
@Table(name = "Estudiante")
public class Estudiante {
    @Id
    private   String documento;

    @Column(nullable = false, length = 40)

    private  String nombres;

    @Column(nullable = false,length =  40)
    private  String apellidos;
    @Column(nullable = false,length = 40)
    private String carrera;

    @ManyToOne
    @JoinColumn(name = "materias")
    Materias mat;


    @ManyToOne
    @JoinColumn(name = "notas")
    Notas notas;

    public Estudiante() {
    }

    public Estudiante(String documento, String nombres, String apellidos, String carrera, Materias mat, Notas notas) {

        this.documento = documento;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.carrera = carrera;
        this.mat = mat;
        this.notas = notas;
    }


    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public Materias getMat() {
        return mat;
    }

    public void setMat(Materias mat) {
        this.mat = mat;
    }

    public Notas getNotas() {
        return notas;
    }

    public void setNotas(Notas notas) {
        this.notas = notas;
    }
}
