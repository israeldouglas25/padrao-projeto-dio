package dio.spring.gof.service.implemente;

import dio.spring.gof.model.Cliente;
import dio.spring.gof.model.Endereco;
import dio.spring.gof.repository.ClienteRepository;
import dio.spring.gof.repository.EnderecoRepository;
import dio.spring.gof.service.ClienteService;
import dio.spring.gof.service.ViaCepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class ClienteServiceImpl implements ClienteService {

    // Singleton: Injetar componentes do Spring com @Autowired;
    @Autowired
    private ClienteRepository clienteRepository;
    @Autowired
    private EnderecoRepository enderecoRepository;
    @Autowired
    private ViaCepService viaCepService;

    // Strategy: Implementar metodos definidos na interface;
    // Facade: Abstrair intregações com subsistemas, provendo uma interface simples.
    @Override
    public List<Cliente> getAll() {
        return clienteRepository.findAll();
    }

    @Override
    public Cliente getById(Long id) {
        return clienteRepository.findById(id).orElseThrow(() -> new RuntimeException("Cliente não existe!"));
    }

    @Override
    public void insert(Cliente cliente) {
        salvarClienteCep(cliente);
    }

    @Override
    public void update(Long id, Cliente cliente) {
        // Buscar cliente por id
        Optional<Cliente> clienteDb = clienteRepository.findById(id);
        if (clienteDb.isPresent()) {
            salvarClienteCep(cliente);
        }
    }

    @Override
    public void delete(Long id) {
        clienteRepository.deleteById(id);
    }

    @Override
    public List<Cliente> getByCep(String cep) {
        Endereco endereco = enderecoRepository.findById(cep).orElseThrow(() -> new RuntimeException("Endereço não existe!"));
        return clienteRepository.findByEndereco(endereco);
    }

    private void salvarClienteCep(Cliente cliente) {
        // Verificar se o endereço já existe (pelo cep)
        String cep = cliente.getEndereco().getCep();
        Endereco endereco = enderecoRepository.findById(cep).orElseGet(() -> {
            // Caso não existir, integrar com ViaCep e persistir o retorno
            Endereco novoEndereco = viaCepService.consultarCep(cep);
            enderecoRepository.save(novoEndereco);
            return novoEndereco;
        });
        cliente.setEndereco(endereco);
        // Inserir cliente com endereço novo ou existente
        clienteRepository.save(cliente);
    }
}
