package com.example.AritonSpicesShop.Condimente.CategorieProduse;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CategorieRepository extends JpaRepository<Categorie, Long> {
    @Query("""
            SELECT c FROM Categorie c
            """)
    List<Categorie> findAllCategorie();

    @Query("""
            SELECT c FROM Categorie c WHERE c.id = :id
            """)
    List<Categorie> findAllByIdTip(long id);
}
