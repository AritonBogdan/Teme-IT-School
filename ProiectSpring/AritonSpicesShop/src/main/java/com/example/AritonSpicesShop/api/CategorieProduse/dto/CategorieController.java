package com.example.AritonSpicesShop.api.CategorieProduse.dto;

import com.example.AritonSpicesShop.Condimente.CategorieProduse.Categorie;
import com.example.AritonSpicesShop.Condimente.CategorieProduse.CategorieRepository;
import com.example.AritonSpicesShop.Exception.BadRequestException;
import com.example.AritonSpicesShop.api.CategorieProduse.dto.dto.CategorieDtoAdauga;
import com.example.AritonSpicesShop.api.CategorieProduse.dto.dto.CategorieDtoModifica;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categorie")
public class CategorieController {
    final CategorieRepository categorieRepository;

    public CategorieController(CategorieRepository categorieRepository) {
        this.categorieRepository = categorieRepository;
    }
    @GetMapping("/tipul")
    public List<Categorie> getAllCategorie() {
        return categorieRepository.findAllCategorie();
    }

    /**
     * Endpoint insereaza / GET
     */
    @GetMapping("/tipul/{id}")
    Categorie getById(@PathVariable long id) {
        return categorieRepository.findById(id).get();
    }

    @PostMapping("/adauga")
    Categorie adauga(@RequestBody CategorieDtoAdauga commandDto) {

        Categorie categorieToBeSaved = new Categorie();
        categorieToBeSaved.setDenumireProdus(commandDto.getDenumireProdus());
        return categorieRepository.save(categorieToBeSaved);

    }
    /**
     * Endpoint UPDATE - POST-modificarea pozitilor in tabel
     */
    @PostMapping("/modifica/{id}")
    Categorie modifica(
            @PathVariable long id,
            @RequestBody CategorieDtoModifica modificaDto) {

        Categorie categorieToBeModified = categorieRepository.findById(id)
                .orElseThrow(() -> new BadRequestException("Nu exista produsul cu id-ul:" + id));


        categorieToBeModified.setDenumireProdus(modificaDto.getDenumireProdus());


        return categorieRepository.save(categorieToBeModified);
    }
    /**
     * Endpoint DELETE
     */
    @DeleteMapping("/sterge/{id}")
    ResponseEntity<String> sterge(@PathVariable long id) {

       Categorie categorieToBeDeleted = categorieRepository.findById(id)
                .orElseThrow(() -> new BadRequestException("Nu exista produsul cu id-ul:" + id));

        categorieRepository.delete(categorieToBeDeleted);
        return ResponseEntity.ok("Produsul a fost sters!");
    }

}
