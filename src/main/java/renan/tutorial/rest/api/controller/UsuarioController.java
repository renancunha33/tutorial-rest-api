package renan.tutorial.rest.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import renan.tutorial.rest.api.model.UsuarioModel;
import renan.tutorial.rest.api.repository.UsuarioRepository;

import java.util.Collections;

@RestController
public class UsuarioController {

    @Autowired
    private UsuarioRepository repository;


    @GetMapping(path ="/api/usuario/{codigo}")
    public ResponseEntity consultar(@PathVariable("codigo") Integer codigo){
        return repository.findById(codigo)
                .map(record -> ResponseEntity.ok().body(record))
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping(path = "/api/usuario/salvar")
    public UsuarioModel salvar(@RequestBody UsuarioModel usuario){
        return repository.save(usuario);
    }

}
