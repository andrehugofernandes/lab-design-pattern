package one.digitalinnovation.labdesignpattern.repository;

import one.digitalinnovation.labdesignpattern.model.Cliente;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Long> {

}