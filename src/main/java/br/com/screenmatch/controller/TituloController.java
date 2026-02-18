package br.com.screenmatch.controller;

import br.com.screenmatch.dto.TituloDTO;
import br.com.screenmatch.service.TituloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TituloController {

    @Autowired
    private TituloService service;

    @GetMapping("/series/frases")
    public TituloDTO obterFraseAletoria(){
        return service.obterFraseAleatoria();
    }
}
