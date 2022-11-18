package br.com.curso.contato.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.curso.contato.dto.FabricanteDTO;

@RestController
@RequestMapping("/fabricante")
public class FabricanteController {


    @PostMapping("/save")
    @ResponseBody
    public FabricanteDTO save(@RequestBody FabricanteDTO dto) {
        System.out.println("Valor Chegou AQUI");
        System.out.println(dto.getName());
        System.out.println(dto.getObservacao());
        return dto;
    }
    
}
