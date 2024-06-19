package com.example.AritonSpicesShop.Condimente.CosCumparaturi;

import com.example.AritonSpicesShop.Condimente.Produse.Produse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface cosCumparaturiRepository extends JpaRepository<cosCumparaturi, Long> {
    @Query("""
            SELECT c FROM cosCumparaturi c
            """)
    List<Produse> findAllCos();

    @Query("""
            SELECT p FROM cosCumparaturi p WHERE p.produsId = :produsId
            """)
    List<cosCumparaturi> findAllByProdusId(int produsId);
}
