package com.zied.produits.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zied.produits.entities.Produit;
import com.zied.produits.repos.ProduitRepository;

@Service
public class ProduitServiceImp implements ProduitService{

	@Autowired
	ProduitRepository produitRepository;

	
	@Override
	public Produit saveProduit(Produit p) {
		// TODO Auto-generated method stub
		return produitRepository.save(p);

	}

	@Override
	public Produit updateProduit(Produit p) {
		// TODO Auto-generated method stub
		return produitRepository.save(p);

	}

	@Override
	public void deleteProduit(Produit p) {
		// TODO Auto-generated method stub
	
		produitRepository.save(p);

	}

	@Override
	public void deleteProduitById(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Produit getProduit(Long id) {
		// TODO Auto-generated method stub
//		return ProduitRepository.deleteById(id);
	return null;
	}

	@Override
	public List<Produit> getAllProduits() {
		// TODO Auto-generated method stub
		return produitRepository.findAll();

	}

}
