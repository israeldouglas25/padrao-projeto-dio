package dio.spring.gof.service;

import dio.spring.gof.model.Cliente;

import java.util.List;


public interface ClienteService {

    List<Cliente> getAll();
    Cliente getById(Long id);
    void insert(Cliente cliente);
    void update(Long id, Cliente cliente);
    void delete(Long id);
    List<Cliente> getByCep(String cep);
}
