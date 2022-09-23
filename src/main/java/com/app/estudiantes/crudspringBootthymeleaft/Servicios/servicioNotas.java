package com.app.estudiantes.crudspringBootthymeleaft.Servicios;

import com.app.estudiantes.crudspringBootthymeleaft.Entidaddb.Notas;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public interface servicioNotas {
    public List<Notas> getNotas();
    public Notas inseretNotas(Notas notas);
    public Notas getNotaBiId(Integer codigo);
    public Notas UpdateNotas(Integer codigo, Map<Object,Object> objectMap);
    public void deliteNotas(Integer codigo);
}
