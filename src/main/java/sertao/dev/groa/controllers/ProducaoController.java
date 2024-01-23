package sertao.dev.groa.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import sertao.dev.groa.services.ProducaoService;



@Controller
@RequestMapping("/groa")
public class ProducaoController {
    @Autowired
    ProducaoService ps;

    @GetMapping("/producao")
    public ModelAndView listarProducoes() {
        ModelAndView mv = new ModelAndView("producoes");
        mv.addObject("producoes",ps.findAll());
        return mv;
    }
    
    
}
