package com.marcelo.EFIngridMarceloPizzeria.service;

import com.marcelo.EFIngridMarceloPizzeria.model.Pizzeria;
import com.marcelo.EFIngridMarceloPizzeria.repository.PizzeriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PizzeriaServiceImpl implements PizzeriaService{

    @Autowired
    private PizzeriaRepository repository;

    @Override
    public Pizzeria porId(Integer idPizzeria) {
        return repository.findById(idPizzeria).orElse(null);
    }

    @Override
    public void guardar(Pizzeria pizzeria) {
        repository.save(pizzeria);
    }

    @Override
    public void actualizar(Pizzeria pizzeria) {
        repository.saveAndFlush(pizzeria);
    }

    @Override
    public void eliminar(Integer idPizzeria) {
        repository.deleteById(idPizzeria);
    }

    @Override
    public List<Pizzeria> lista() {
        return repository.findAll();
    }
}
