package com.marcelo.EFIngridMarceloPizzeria.repository;

import com.marcelo.EFIngridMarceloPizzeria.model.Pizzeria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PizzeriaRepository extends JpaRepository<Pizzeria, Integer> {
}
