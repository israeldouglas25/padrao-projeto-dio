package dio.spring.gof.service.implemente;

import dio.spring.gof.model.Endereco;
import dio.spring.gof.repository.EnderecoRepository;
import dio.spring.gof.service.EnderecoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnderecoServiceImpl implements EnderecoService {

    @Autowired
    private EnderecoRepository enderecoRepository;
    @Override
    public List<Endereco> getAll() {
        return enderecoRepository.findAll();
    }

    @Override
    public Endereco getById(String cep) {
        return enderecoRepository.findById(cep).orElseThrow(() -> new RuntimeException("Endereço não existe!"));
    }
}
