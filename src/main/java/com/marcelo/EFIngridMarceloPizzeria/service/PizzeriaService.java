package com.marcelo.EFIngridMarceloPizzeria.service;

import com.marcelo.EFIngridMarceloPizzeria.model.Pizzeria;

import java.util.List;

public interface PizzeriaService {

    Pizzeria porId(Integer idPizzeria);
    void guardar(Pizzeria pizzeria);
    void actualizar(Pizzeria pizzeria);
    void eliminar(Integer idPizzeria);
    List<Pizzeria> lista();
}
