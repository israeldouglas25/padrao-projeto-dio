package dio.spring.gof.controller;

import dio.spring.gof.model.Endereco;
import dio.spring.gof.service.EnderecoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/enderecos")
public class EnderecoController {

    @Autowired
    private EnderecoService enderecoService;

    @GetMapping
    public ResponseEntity<List<Endereco>> getAll() {
        return ResponseEntity.ok(enderecoService.getAll());
    }

    @GetMapping("/{cep}")
    public ResponseEntity<Endereco> getById(@PathVariable String cep) {
        return ResponseEntity.ok(enderecoService.getById(cep));
    }

}
