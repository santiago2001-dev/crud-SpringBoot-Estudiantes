package com.app.estudiantes.crudspringBootthymeleaft.Servicios;

import com.app.estudiantes.crudspringBootthymeleaft.Entidaddb.Notas;
import org.springframework.beans.factory.annotation.Autowired;
import com.app.estudiantes.crudspringBootthymeleaft.Repositorio.repositorioNotas;
import org.springframework.data.util.ReflectionUtils;

import java.lang.reflect.Field;
import java.util.List;
import java.util.Map;

public class servicioImnotas  implements  servicioNotas{
    @Autowired
    private repositorioNotas rep;
    @Override
    public List<Notas> getNotas() {
        return rep.findAll();
    }

    @Override
    public Notas inseretNotas(Notas notas) {
        return rep.save(notas);
    }

    @Override
    public Notas getNotaBiId(Integer codigo) {
        return rep.findById(codigo).get();
    }

    @Override
    public Notas UpdateNotas(Integer codigo, Map<Object, Object> objectMap) {

        Notas nots=rep.findById(codigo).get();
        objectMap.forEach((key, value) ->{
            Field field= ReflectionUtils.findField(Notas.class, (String) key);
            field.setAccessible(true);
            ReflectionUtils.setField(field, nots, value);
        });
        return  rep.save(nots);
    }

    @Override
    public void deliteNotas(Integer codigo) {
        rep.deleteById(codigo);

    }
}
