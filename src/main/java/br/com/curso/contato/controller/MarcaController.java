package br.com.curso.contato.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.curso.contato.dto.MarcaDTO;

@RestController
@RequestMapping("/marca")
public class MarcaController {


    @PostMapping("/save")
    @ResponseBody
    public MarcaDTO save(@RequestBody MarcaDTO marcaDTO) {        
        System.out.println(marcaDTO.getName());
        return marcaDTO;
    }

    
}
