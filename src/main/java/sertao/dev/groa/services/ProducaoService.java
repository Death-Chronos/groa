package sertao.dev.groa.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sertao.dev.groa.entities.Producao;
import sertao.dev.groa.repositories.ProducaoRepository;

@Service
public class ProducaoService {
    @Autowired
    ProducaoRepository pr;

    public List<Producao> findAll(){
        return pr.findAll();
    }

    public void save(Producao producao){
        pr.save(producao);
    }
}
