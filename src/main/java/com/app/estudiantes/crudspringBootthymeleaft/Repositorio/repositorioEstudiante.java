package com.app.estudiantes.crudspringBootthymeleaft.Repositorio;

import com.app.estudiantes.crudspringBootthymeleaft.Entidaddb.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;

public interface repositorioEstudiante extends JpaRepository<Estudiante,Integer> {
}
