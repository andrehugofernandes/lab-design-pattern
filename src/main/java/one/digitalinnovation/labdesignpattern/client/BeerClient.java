package one.digitalinnovation.labdesignpattern.client;

import one.digitalinnovation.labdesignpattern.model.Beer;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import java.util.List;

/**
 * Client HTTP, criado via <b>OpenFeign</b>, para o consumo da API do <b>PUNK API</b>.
 *
 * @see <a href="https://spring.io/projects/spring-cloud-openfeign">Spring Cloud OpenFeign</a>
 * @see <a href="https://api.punkapi.com/v2/">PUNK API</a>
 * @author andrehugofernandes
 */
@FeignClient(name = "BeerClient", url = "https://api.punkapi.com/v2/beers")
public interface BeerClient {


    @GetMapping("/random") List<Beer> getRandomBeer();

    @GetMapping("/{id}") List<Beer> getBeerById(@PathVariable("id") Long id);
}