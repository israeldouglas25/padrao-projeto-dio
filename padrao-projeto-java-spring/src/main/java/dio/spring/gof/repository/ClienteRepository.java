package dio.spring.gof.repository;

import dio.spring.gof.model.Cliente;
import dio.spring.gof.model.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    List<Cliente> findByEndereco(Endereco endereco);
}
