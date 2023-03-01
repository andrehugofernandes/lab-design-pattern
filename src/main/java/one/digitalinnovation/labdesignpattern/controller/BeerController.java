package one.digitalinnovation.labdesignpattern.controller;

import lombok.RequiredArgsConstructor;
import one.digitalinnovation.labdesignpattern.model.Beer;
import one.digitalinnovation.labdesignpattern.service.BeerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/beer")
public class BeerController {

    private final BeerService beerService;

    @GetMapping("/{id}")
    public List<Beer> buscarPorId(@PathVariable Long id){
        return beerService.getBeerById(id);
    }

    @GetMapping()
    public List<Beer> getRandomBeer(){
        return beerService.getRandomBeer();
    }

    public BeerService getBeerService() {
        return beerService;
    }
}
