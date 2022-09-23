package com.app.estudiantes.crudspringBootthymeleaft.Repositorio;

import com.app.estudiantes.crudspringBootthymeleaft.Entidaddb.Materias;
import org.springframework.data.jpa.repository.JpaRepository;

public interface repositorioMaterias extends JpaRepository<Materias,Integer> {
}
