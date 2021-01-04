//package com.example.demo.class;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//package com.example.demo.resoucer;

@RestController
@RequestMapping(value = "/categorias")
public class CategoriaResourcer {

    @RequestMapping(method = RequestMethod.GET)
    public String listar() {
        return "Rest esta funcionando!";
    }

}
