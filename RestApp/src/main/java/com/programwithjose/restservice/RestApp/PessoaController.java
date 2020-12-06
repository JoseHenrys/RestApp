package com.programwithjose.restservice.RestApp;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/pessoa")
public class PessoaController {

    @GetMapping
    public ResponseEntity<Pessoa> getPessoa(){
        final Pessoa pessoa = new Pessoa("Jose Henrique", 23);
        return ResponseEntity.ok(pessoa);
    }
}
