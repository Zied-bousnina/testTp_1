package com.zied.produits.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zied.produits.entities.Produit;

public interface ProduitRepository extends JpaRepository<Produit, Long> {

}
