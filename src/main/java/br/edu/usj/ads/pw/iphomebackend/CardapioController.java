package br.edu.usj.ads.pw.iphomebackend;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
@CrossOrigin
public class CardapioController {

    @Autowired
    CardapioRepository cardapioRepository;

    @GetMapping(value = "/")
    public List<Cardapio> getListarTodos() {
        List<Cardapio> lista = cardapioRepository.findAll();
        return lista;
    }

    @PostMapping(value = "/adicionar")
    public Cardapio postAdicionar(@RequestBody Cardapio cardapio) {
        Cardapio cardapioNovo = cardapioRepository.save(cardapio);
        return cardapioNovo;
    }

    @GetMapping(value = "/deletar/{id}")
    public void postDeletar(@PathVariable Long id) {
        cardapioRepository.deleteById(id);
    }
}
