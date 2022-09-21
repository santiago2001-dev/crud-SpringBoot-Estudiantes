package com.app.estudiantes.crudspringBootthymeleaft.Entidaddb;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "notas")
public class Notas {
    @Id
    private  int codigo;
    @Column(nullable = false,length = 10)
    private  int SemanaUno;

    @Column(nullable = false,length = 10)
    private  int SemanaDos;

    @Column(nullable = false,length = 10)
    private  int SemanaTres;

    public Notas() {
    }

    public Notas(int codigo, int semanaUno, int semanaDos, int semanaTres) {
        this.codigo = codigo;
        SemanaUno = semanaUno;
        SemanaDos = semanaDos;
        SemanaTres = semanaTres;
    }


    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getSemanaUno() {
        return SemanaUno;
    }

    public void setSemanaUno(int semanaUno) {
        SemanaUno = semanaUno;
    }

    public int getSemanaDos() {
        return SemanaDos;
    }

    public void setSemanaDos(int semanaDos) {
        SemanaDos = semanaDos;
    }

    public int getSemanaTres() {
        return SemanaTres;
    }

    public void setSemanaTres(int semanaTres) {
        SemanaTres = semanaTres;
    }
}
