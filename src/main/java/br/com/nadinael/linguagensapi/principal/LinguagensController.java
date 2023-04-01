package br.com.nadinael.linguagensapi.principal;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class LinguagensController {
    
    @Autowired 
    private LinguagemRepository repositorio;
        
    @GetMapping(value = "/linguagens")
    public List<Linguagem> obterLinguagens(){
         List<Linguagem> linguagens = repositorio.findAll();
         return linguagens;
    }
    @PostMapping(value = "linguagens")
    public Linguagem cadastrarLinguagem(@RequestBody Linguagem linguagem){
        Linguagem salva = repositorio.save(linguagem);
        return salva;
    }

    @GetMapping(value = "/")
    public ModelAndView index() {
        ModelAndView mv = new ModelAndView("index");
        return mv;
    }

    
}
