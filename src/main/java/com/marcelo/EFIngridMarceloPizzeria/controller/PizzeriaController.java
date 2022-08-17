package com.marcelo.EFIngridMarceloPizzeria.controller;

import com.marcelo.EFIngridMarceloPizzeria.model.Pizzeria;
import com.marcelo.EFIngridMarceloPizzeria.service.PizzeriaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/pizzeria")
public class PizzeriaController {

    @Autowired
    private PizzeriaServiceImpl pizzeriaImpl;

    @GetMapping("/listar")
    public @ResponseBody ResponseEntity<List<Pizzeria>> listarP(){
        return new ResponseEntity<List<Pizzeria>>(pizzeriaImpl.lista(), HttpStatus.OK);
    }

    @GetMapping("/buscar/{idPizzeria}")
    public ResponseEntity<Pizzeria> buscarP(@PathVariable Integer idPizzeria){
        Pizzeria pi = pizzeriaImpl.porId(idPizzeria);
        if(pi!=null) {
            return new ResponseEntity<Pizzeria>(pi,HttpStatus.OK);
        }
        return new ResponseEntity<Pizzeria>(HttpStatus.NOT_FOUND);
    }

    @PostMapping("/guardar")
    public ResponseEntity<Void> guardarP(@RequestBody Pizzeria pizzeria){
        pizzeriaImpl.guardar(pizzeria);
        return new ResponseEntity<Void>(HttpStatus.CREATED);
    }

    @PostMapping("actualizar")
    public ResponseEntity<Void> actualizarP(@RequestBody Pizzeria pizzeria){

        Pizzeria  pi = pizzeriaImpl.porId(pizzeria.getIdPizzeria());

        if(pi!=null) {
            pizzeriaImpl.actualizar(pizzeria);
            return new ResponseEntity<Void>(HttpStatus.OK);
        }
        return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("/eliminar/{idPizzeria}")
    public ResponseEntity<Void> eliminar(@PathVariable Integer idPizzeria){
        Pizzeria pi = pizzeriaImpl.porId(idPizzeria);
        if(pi!=null) {
            pizzeriaImpl.eliminar(idPizzeria);
            return new ResponseEntity<Void>(HttpStatus.OK);
        }

        return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);

    }

}
