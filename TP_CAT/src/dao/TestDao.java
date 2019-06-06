package dao;

import metier.entities.Produit;

public class TestDao {
	public static void main(String[] args) {
		ProduitDao dao = new ProduitDao();
		Produit p1=dao.save(new Produit("HP", 900, 45));
		Produit p2=dao.save(new Produit("imp HP", 900, 45));
		Produit p3=dao.save(new Produit("ecr HP", 900, 45));
		
	}
}
