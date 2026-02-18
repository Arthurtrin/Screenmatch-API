package br.com.screenmatch.repository;

import br.com.screenmatch.entity.Titulo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

public interface TituloRepository extends JpaRepository<Titulo, Long> {

    @Query("SELECT t FROM Titulo t ORDER BY RANDOM() LIMIT 1")
    Titulo obterTituloAleatorio();
}
