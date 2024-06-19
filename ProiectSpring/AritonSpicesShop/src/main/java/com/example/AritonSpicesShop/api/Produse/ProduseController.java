package com.example.AritonSpicesShop.api.Produse;

import com.example.AritonSpicesShop.Condimente.CategorieProduse.CategorieRepository;
import com.example.AritonSpicesShop.Condimente.Produse.Produse;
import com.example.AritonSpicesShop.Condimente.Produse.ProduseRepository;
import com.example.AritonSpicesShop.Exception.BadRequestException;
import com.example.AritonSpicesShop.api.Produse.dto.ProduseCategorieDto;
import com.example.AritonSpicesShop.api.Produse.dto.ProduseDtoAdauga;
import com.example.AritonSpicesShop.api.Produse.dto.ProduseDtoModifica;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/condimente")
public class ProduseController {
    final ProduseRepository produseRepository;
    final CategorieRepository categorieRepository;


    public ProduseController(ProduseRepository produseRepository, CategorieRepository categorieRepository) {
        this.produseRepository = produseRepository;
        this.categorieRepository = categorieRepository;
    }

    @GetMapping("/produse")
    public List<Produse> getAllProduse() {
        return produseRepository.findAll();
    }

    /**
     * Endpoint insereaza / GET
     */
    @GetMapping("/produse/{id}")
    Produse getById(@PathVariable Integer id) {
        return produseRepository.findById(id).get();
    }

    /**
     * Endpoint Adauga /POST - modificarea datelor existente in tabel
     */
    @PostMapping("/adauga")
    Produse adauga(@RequestBody ProduseDtoAdauga commandDto) {

        Produse produseToBeSaved = new Produse();
        if (commandDto.getDenumireProdus() == null || commandDto.getDenumireProdus() == " ") {
            throw new BadRequestException("Trebuie completat cu un nume pentru produs");
        }

        /**Verificam daca esti aceasta categorie este salvata deja in baza de date*/
        categorieRepository.findById(commandDto.getCategorieId())
                .orElseThrow(() -> new BadRequestException("Nu exista categoria selectata!"));

        produseToBeSaved.setDenumireProdus(commandDto.getDenumireProdus());
        produseToBeSaved.setBazaPret(commandDto.getBazaPret());
        produseToBeSaved.setTva(commandDto.getTva());
        produseToBeSaved.setPretCuTva(commandDto.getPretCuTva());
        produseToBeSaved.setCategorieId(commandDto.getCategorieId());

        return produseRepository.save(produseToBeSaved);
    }

    /**
     * Endpoint UPDATE - POST-modificarea pozitilor in tabel
     */
    @PostMapping("/modifica/{id}")
    Produse modifica(
            @PathVariable Integer id,
            @RequestBody ProduseDtoModifica modificaDto) {

        Produse productToBeModified = produseRepository.findById(id)
                .orElseThrow(() -> new BadRequestException("Nu exista produsul cu id-ul:" + id));

        /**verificare calcule price/tva*/
        if (modificaDto.getBazaPret() + modificaDto.getTva() != modificaDto.getPretCuTva()) {
            throw new BadRequestException("Pretul fara tva+tva nu corespunde cu pretul cu tva");
        }
        productToBeModified.setDenumireProdus(modificaDto.getDenumireProdus());
        productToBeModified.setBazaPret(modificaDto.getBazaPret());
        productToBeModified.setTva(modificaDto.getTva());
        productToBeModified.setPretCuTva(modificaDto.getPretCuTva());
        productToBeModified.setCategorieId(modificaDto.getCategorieId());

        return produseRepository.save(productToBeModified);
    }

    /**
     * Endpoint DELETE
     */
    @DeleteMapping("/sterge/{id}")
    ResponseEntity<String> sterge(@PathVariable Integer id) {

        Produse productToBeDeleted = produseRepository.findById(id)
                .orElseThrow(() -> new BadRequestException("Nu exista produsul cu id-ul:" + id));

        produseRepository.delete(productToBeDeleted);
        return ResponseEntity.ok("Produsul a fost sters!");
    }


    /** Endpoint DISCOUNT utilizator-> cupon pt produs/cupon pt tot cosul*/
    @PostMapping("/checkout/discount/{id}")
    Produse discount(@PathVariable Integer id,
                     @RequestParam String discount) {
        Produse productDiscount = produseRepository.findById(id)
                .orElseThrow(() -> new BadRequestException("Discountul pentru produsul" + id + "a fost aplicat!"));

        double procentDiscount = 0;
        if (discount == null || !discount.equals("condiment")) {
            procentDiscount = 1;
        } else {
            procentDiscount = (double) 50 / 100;
        }
        int priceWithoutTva = (int) (productDiscount.getBazaPret() * procentDiscount);
        int tva = (int) (productDiscount.getTva() * procentDiscount);
        int priceWithTva = (int) (productDiscount.getPretCuTva() * procentDiscount);

        productDiscount.setBazaPret(priceWithoutTva);
        productDiscount.setTva(tva);
        productDiscount.setPretCuTva(priceWithTva);

        return productDiscount;
    }

    /**
     * GET afisesa id-ul produsului categoriei
     */
    @GetMapping("/categorie/{categorieId}")
    List<Produse> getAllProduseByCategorieId(
            @PathVariable long categorieId) {

        /**Verificam daca esti aceasta categorie este salvata deja in baza de date*/
        categorieRepository.findById(categorieId)
                .orElseThrow(() -> new BadRequestException("Nu exista categoria selectata!"));
        return produseRepository.findAllByCategorieId(categorieId);
    }
/**JOIN*/
    @GetMapping("/produse-categorie-details/{produseId}")
    ProduseCategorieDto getProductAndCategoryDetailsByProductId(
            @PathVariable int produseId) {

        return produseRepository.findProductAndCategoryDetailsByProductId(produseId);
    }



}
