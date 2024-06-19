package com.example.AritonSpicesShop.Condimente.Produse;

import com.example.AritonSpicesShop.api.Produse.dto.ProduseCategorieDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProduseRepository extends JpaRepository<Produse, Integer> {
    @Query("""
            SELECT p FROM Produse p
            """)
    List<Produse> findAllProduse();

    @Query("""
            SELECT p FROM Produse p WHERE p.categorieId = :categorieId
            """)
    List<Produse> findAllByCategorieId(long categorieId);

    @Query("""
            SELECT new com.example.AritonSpicesShop.api.Produse.dto.ProduseCategorieDto(p.denumireProdus, c.denumireProdus)
            FROM Produse p JOIN Categorie c ON p.categorieId = c.id
            WHERE p.id = :produseId
            """)
    ProduseCategorieDto findProductAndCategoryDetailsByProductId(int produseId);

}
