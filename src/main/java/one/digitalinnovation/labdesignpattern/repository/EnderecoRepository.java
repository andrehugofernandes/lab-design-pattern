package one.digitalinnovation.labdesignpattern.repository;

import one.digitalinnovation.labdesignpattern.model.Endereco;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoRepository extends CrudRepository<Endereco, String> {

}
