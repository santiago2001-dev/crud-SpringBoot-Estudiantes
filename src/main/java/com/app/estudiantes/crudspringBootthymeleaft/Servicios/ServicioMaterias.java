package com.app.estudiantes.crudspringBootthymeleaft.Servicios;

import com.app.estudiantes.crudspringBootthymeleaft.Entidaddb.Materias;

import java.util.List;
import java.util.Map;

public interface ServicioMaterias {

    public List<Materias> getMaterias();
    public Materias insertMateria(Materias materia);
    public Materias getMateriaById(Integer idMateria);
    public void deliteMateria(Integer idMateria);
    public Materias updateMateria(Integer idMateria, Map<Object,Object> objectMap);

}
