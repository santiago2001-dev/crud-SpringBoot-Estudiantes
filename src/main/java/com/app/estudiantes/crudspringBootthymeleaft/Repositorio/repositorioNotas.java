package com.app.estudiantes.crudspringBootthymeleaft.Repositorio;

import com.app.estudiantes.crudspringBootthymeleaft.Entidaddb.Notas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface repositorioNotas extends JpaRepository<Notas,Integer> {
}
