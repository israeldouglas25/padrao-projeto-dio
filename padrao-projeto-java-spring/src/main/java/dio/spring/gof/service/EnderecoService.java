package dio.spring.gof.service;

import dio.spring.gof.model.Endereco;

import java.util.List;

public interface EnderecoService {

    List<Endereco> getAll();
    Endereco getById(String cep);
}
