package br.com.screenmatch.service;

import br.com.screenmatch.dto.TituloDTO;
import br.com.screenmatch.entity.Titulo;
import br.com.screenmatch.repository.TituloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TituloService {

    @Autowired
    private TituloRepository repository;

    public TituloDTO obterFraseAleatoria() {
        return toTituloDTO(repository.obterTituloAleatorio());
    }

    public static TituloDTO toTituloDTO(Titulo titulo){
        return new TituloDTO(titulo.getNome(),
                titulo.getFrase(), titulo.getPersonagem(),
                titulo.getPoster());
    }
}
