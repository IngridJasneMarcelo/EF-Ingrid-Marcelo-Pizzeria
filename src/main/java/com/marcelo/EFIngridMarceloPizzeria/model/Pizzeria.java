package com.marcelo.EFIngridMarceloPizzeria.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Setter
@Getter
@Table(name = "pizzeria")
public class Pizzeria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idPizzeria;
    private String direccion;
    private String sede;
}
