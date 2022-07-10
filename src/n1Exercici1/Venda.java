package n1Exercici1;

import java.util.ArrayList;

public class Venda {

	//Atributs 
	private static double preuTotal;
	
	//ArrayList de productes
	
	static ArrayList<Producte> productes = new ArrayList<Producte>();

	
	// Getter i Setter
	
	public static double getPreuTotal() {
		return preuTotal;
	}

	public static void setPreuTotal(double preuTotal) {
		Venda.preuTotal = preuTotal;
	}

	public static ArrayList<Producte> getProductes() {
		return productes;
	}

	public static void setProductes(ArrayList<Producte> productes) {
		Venda.productes = productes;
	}
	
	
	//Mètode i excepció
	
	public static void calcularTotal() throws VendaBuidaException {
		
		if (productes.size()==0) {
			throw new VendaBuidaException("Per fer una venta primer has d'afegir productes");
		}else {
			for (Producte producte : productes) {
				preuTotal += producte.getPreu();
			}
		
		System.out.println("El preu total de la compra es " + preuTotal);
		
		}
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
}
