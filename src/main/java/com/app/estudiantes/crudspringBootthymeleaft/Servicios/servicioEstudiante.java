package com.app.estudiantes.crudspringBootthymeleaft.Servicios;

import com.app.estudiantes.crudspringBootthymeleaft.Entidaddb.Estudiante;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public interface servicioEstudiante {
    public List<Estudiante> getestudiantes();
    public Estudiante insertestudiante(Estudiante estudiante);
    public Estudiante getEstudianteById(Integer documento);
    public  Estudiante updateEstudiante(Integer documento , Map<Objects,Object>objectMap);
    public  void deliteEstudiante(Integer documento);
}
