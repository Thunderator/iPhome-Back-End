package br.edu.usj.ads.pw.iphomebackend;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CardapioRepository extends CrudRepository<Cardapio, Long> {
    List<Cardapio> findAll();
}