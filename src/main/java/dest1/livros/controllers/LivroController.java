package dest1.livros.controllers;

import dest1.livros.entities.Livro;
import dest1.livros.reposiries.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/livros")
public class LivroController {

    @Autowired
    LivroRepository repository;

    @PostMapping
    public Livro m(@RequestBody Livro l){
        return repository.save(l);
    }

    @GetMapping
    public List<Livro> mostrar(){
        return repository.findAll();
    }
}
