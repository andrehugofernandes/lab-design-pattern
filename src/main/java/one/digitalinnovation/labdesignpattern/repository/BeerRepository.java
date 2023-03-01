package one.digitalinnovation.labdesignpattern.repository;

import one.digitalinnovation.labdesignpattern.model.Beer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface BeerRepository extends CrudRepository<Beer, String> {


}