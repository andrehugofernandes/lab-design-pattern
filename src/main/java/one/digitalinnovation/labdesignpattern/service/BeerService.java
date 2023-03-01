package one.digitalinnovation.labdesignpattern.service;

import lombok.RequiredArgsConstructor;
import one.digitalinnovation.labdesignpattern.client.BeerClient;
import one.digitalinnovation.labdesignpattern.model.Beer;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BeerService {
    private final BeerClient beerClient;

   public List<Beer> getRandomBeer(){
        return beerClient.getRandomBeer();
    }

    public List<Beer> getBeerById(Long id){
        return beerClient.getBeerById(id);
    }

}
