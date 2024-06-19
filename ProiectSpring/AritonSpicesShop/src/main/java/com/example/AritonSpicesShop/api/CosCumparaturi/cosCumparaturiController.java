package com.example.AritonSpicesShop.api.CosCumparaturi;

import com.example.AritonSpicesShop.Condimente.CosCumparaturi.cosCumparaturi;
import com.example.AritonSpicesShop.Condimente.CosCumparaturi.cosCumparaturiRepository;
import com.example.AritonSpicesShop.Condimente.Produse.Produse;
import com.example.AritonSpicesShop.Condimente.Produse.ProduseRepository;
import com.example.AritonSpicesShop.Exception.BadRequestException;
import com.example.AritonSpicesShop.api.CosCumparaturi.dto.CosDtoAdauga;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cos")
public class cosCumparaturiController {

    final cosCumparaturiRepository cosRepository;
    final ProduseRepository produseRepository;

    public cosCumparaturiController(cosCumparaturiRepository cosRepository, ProduseRepository produseRepository) {
        this.cosRepository = cosRepository;
        this.produseRepository = produseRepository;
    }


@GetMapping("/coscumparaturi")
public List<cosCumparaturi> getAllCos() {
    return cosRepository.findAll();
}

/**
 * Endpoint insereaza / GET
 */
@GetMapping("/coscumparaturi/{produsId}")
cosCumparaturi getById(@PathVariable Long produsId) {
    return cosRepository.findById(produsId).get();
}

/**
 * Endpoint Adauga /POST - modificarea datelor existente in tabel
 */
@PostMapping("/adaugaincos")
cosCumparaturi adaugaincos(@RequestBody CosDtoAdauga commandDto) {

    cosCumparaturi cosToBeSaved = new cosCumparaturi();
    if (commandDto.getProdusId() == 0) {
        throw new BadRequestException("Trebuie completat cu un produsId pentru produs");
    }

    /**Verificam daca esti aceasta categorie este salvata deja in baza de date*/
    produseRepository.findById(commandDto.getProdusId())
            .orElseThrow(() -> new BadRequestException("Nu exista produsID selectat!"));

    cosToBeSaved.setProdusId(commandDto.getProdusId());

    return cosRepository.save(cosToBeSaved);
}

/**
 * Endpoint DELETE
 */
@DeleteMapping("/sterge/{produsId}")
ResponseEntity<String> sterge(@PathVariable long produsId) {

    cosCumparaturi cosToBeDeleted = cosRepository.findById(produsId)
            .orElseThrow(() -> new BadRequestException("Nu exista produsul cu id-ul:" + produsId));

    cosRepository.delete(cosToBeDeleted);
    return ResponseEntity.ok("Produsul a fost sters!");
}

}
