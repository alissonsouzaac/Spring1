package com.example.demo.class;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Categoria;

@RestController
@RequestMapping(value = "/categorias")
public class CategoriaResourcer {

    @RequestMapping(method = RequestMethod.GET)
    public String listar() {

        Categoria cat = new Categoria(1, "Informatica");
        Categoria cat2 = new Categoria(2, "Escritorio");

        List<Categoria> lista = new ArrayList<>();
        lista.add(cat);
        lista.add(cat2);

        return lista;
    }

}
